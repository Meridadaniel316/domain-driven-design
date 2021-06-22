package co.com.sofka.domain.trabajador.commands;

import co.com.sofka.domain.trabajador.values.Nombres;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.trabajador.values.TrabajadorId;

public class CambiarNombres implements Command {

    private final TrabajadorId id;
    private final Nombres nombres;

    public CambiarNombres(TrabajadorId id, Nombres nombres){
        this.id = id;
        this.nombres = nombres;
    }

    public TrabajadorId getId() { return id; }

    public Nombres getNombres() {
        return nombres;
    }
}
