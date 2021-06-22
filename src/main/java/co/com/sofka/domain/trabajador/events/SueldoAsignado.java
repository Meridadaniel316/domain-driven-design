package co.com.sofka.domain.trabajador.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.trabajador.values.SueldoId;

public class SueldoAsignado extends DomainEvent {

    private final SueldoId sueldoId;

    public SueldoAsignado(SueldoId sueldoId){
        super("sofka.trabajador.sueldoasignado");
        this.sueldoId = sueldoId;
    }

    public SueldoId getSueldoId() {
        return sueldoId;
    }
}
