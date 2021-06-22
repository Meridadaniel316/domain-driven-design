package co.com.sofka.domain.trabajador.commands;

import co.com.sofka.domain.trabajador.values.Apellidos;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.trabajador.values.TrabajadorId;

public class CambiarApellidos implements Command {

    private final TrabajadorId id;
    private final Apellidos apellidos;

    public CambiarApellidos(TrabajadorId id, Apellidos apellidos){
        this.id = id;
        this.apellidos = apellidos;
    }

    public TrabajadorId getId() { return id; }

    public Apellidos getApellidos() {
        return apellidos;
    }
}
