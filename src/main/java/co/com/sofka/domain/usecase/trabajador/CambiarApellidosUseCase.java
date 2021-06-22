package co.com.sofka.domain.usecase.trabajador;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.trabajador.Trabajador;
import co.com.sofka.domain.trabajador.commands.CambiarApellidos;

public class CambiarApellidosUseCase extends UseCase<RequestCommand<CambiarApellidos>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarApellidos> cambiarApellidosRequestCommand) {
        var command = cambiarApellidosRequestCommand.getCommand();
        var trabajador = Trabajador.from(command.getId(), retrieveEvents(command.getId().value()));
        trabajador.cambiarApellidos(command.getApellidos());
        emit().onResponse(new ResponseEvents(trabajador.getUncommittedChanges()));
    }
}