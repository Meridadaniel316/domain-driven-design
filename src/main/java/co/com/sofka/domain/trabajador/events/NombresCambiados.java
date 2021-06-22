package co.com.sofka.domain.trabajador.events;

import co.com.sofka.domain.trabajador.values.Nombres;
import co.com.sofka.domain.generic.DomainEvent;

public class NombresCambiados extends DomainEvent {

    private final Nombres nombres;

    public NombresCambiados(Nombres nombres){
        super("sofka.trabajador.nombrescambiados");

        this.nombres = nombres;
    }

    public Nombres getNombres() {
        return nombres;
    }
}
