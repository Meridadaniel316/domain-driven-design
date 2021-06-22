package co.com.sofka.domain.cuenta.commands;

import co.com.sofka.domain.cuenta.values.*;

import co.com.sofka.domain.generic.Command;

public class CrearCuenta implements Command {
    private final CuentaId id;
    private final Nombres nombres;
    private final Apellidos apellidos;
    private final Identificacion identificacion;
    private final Usuario usuario;
    private final Email email;

    public CrearCuenta(CuentaId id, Nombres nombres, Apellidos apellidos, Identificacion identificacion, Usuario usuario, Email email){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.usuario = usuario;
        this.email = email;
    }

    public Nombres getNombres() {
        return nombres;
    }

    public Apellidos getApellidos() {
        return apellidos;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
    public CuentaId getId() { return id; }

    public Usuario getUsuario() { return usuario; }

    public Email getEmail() { return email; }
}