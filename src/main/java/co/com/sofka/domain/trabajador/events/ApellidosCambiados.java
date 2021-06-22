package co.com.sofka.domain.trabajador.events;

import co.com.sofka.domain.trabajador.values.Apellidos;
import co.com.sofka.domain.generic.DomainEvent;

public class ApellidosCambiados extends DomainEvent {

    private Apellidos apellidos;

    public ApellidosCambiados(Apellidos apellidos){
        super("sofka.trabajador.apellidoscambiados");
        this.apellidos = apellidos;
    }

    public Apellidos getApellidos() {
        return apellidos;
    }
}
