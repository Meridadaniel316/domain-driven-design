package co.com.sofka.domain.usecase.trabajador;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.trabajador.Trabajador;
import co.com.sofka.domain.trabajador.commands.CambiarNombres;

public class CambiarNombresUseCase extends UseCase<RequestCommand<CambiarNombres>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarNombres> cambiarNombresRequestCommand) {
        var command = cambiarNombresRequestCommand.getCommand();
        var trabajador = Trabajador.from(command.getId(), retrieveEvents(command.getId().value()));
        trabajador.cambiarNombres(command.getNombres());
        emit().onResponse(new ResponseEvents(trabajador.getUncommittedChanges()));
    }
}