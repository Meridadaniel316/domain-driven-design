package co.com.sofka.domain.usecase.trabajador;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.trabajador.Trabajador;
import co.com.sofka.domain.trabajador.commands.CambiarIdentificacion;

public class CambiarIdentificacionUseCase extends UseCase<RequestCommand<CambiarIdentificacion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarIdentificacion> cambiarIdentificacionRequestCommand){
        var command = cambiarIdentificacionRequestCommand.getCommand();
        var trabajador = Trabajador.from(command.getId(), retrieveEvents(command.getId().value()));
        trabajador.cambiarIdentificacion((command.getIdentificacion()));
        emit().onResponse(new ResponseEvents(trabajador.getUncommittedChanges()));
    }
}
