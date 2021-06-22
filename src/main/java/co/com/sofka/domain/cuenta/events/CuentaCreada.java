package co.com.sofka.domain.cuenta.events;

import co.com.sofka.domain.cuenta.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaCreada extends DomainEvent {
    private final Nombres nombres;
    private final Apellidos apellidos;
    private final Identificacion identificacion;
    private final Usuario usuario;
    private final Email email;

    public CuentaCreada(Nombres nombres, Apellidos apellidos, Identificacion identificacion, Usuario usuario, Email email){
        super("domain.cuenta.cuentacreada");
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.usuario = usuario;
        this.email = email;
    }

    public Nombres getNombres() { return nombres; }
    public Apellidos getApellidos() { return apellidos; }
    public Identificacion getIdentificacion() { return identificacion; }
    public Usuario getUsuario() {
        return usuario;
    }

    public Email getEmail() {
        return email;
    }
}