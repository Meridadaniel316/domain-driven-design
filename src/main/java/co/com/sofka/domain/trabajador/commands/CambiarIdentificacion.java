package co.com.sofka.domain.trabajador.commands;

import co.com.sofka.domain.trabajador.values.Identificacion;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.trabajador.values.TrabajadorId;

public class CambiarIdentificacion implements Command {

    private final TrabajadorId id;
    private final Identificacion identificacion;

    public CambiarIdentificacion(TrabajadorId id, Identificacion identificacion){
        this.id = id;
        this.identificacion = identificacion;
    }

    public TrabajadorId getId() { return id; }
    public Identificacion getIdentificacion() {
        return identificacion;
    }
}
