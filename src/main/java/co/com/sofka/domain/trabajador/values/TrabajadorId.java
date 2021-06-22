package co.com.sofka.domain.trabajador.values;

import co.com.sofka.domain.cuenta.values.CuentaId;
import co.com.sofka.domain.generic.Identity;

public class TrabajadorId extends Identity {
    public TrabajadorId(){

    }

    private TrabajadorId(String id) { super(id); }

    public static TrabajadorId of(String id) { return new TrabajadorId(id); }
}
