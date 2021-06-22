package co.com.sofka.domain.trabajador.events;

import co.com.sofka.domain.trabajador.values.Identificacion;
import co.com.sofka.domain.generic.DomainEvent;

public class IdentificacionCambiada extends DomainEvent {

    private final Identificacion identificacion;

    public IdentificacionCambiada(Identificacion identificacion){
        super("sofka.trabajador.identificacioncambiada");
        this.identificacion = identificacion;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
