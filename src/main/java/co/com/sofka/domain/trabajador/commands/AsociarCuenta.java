package co.com.sofka.domain.trabajador.commands;

import co.com.sofka.domain.cuenta.values.CuentaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.trabajador.values.TrabajadorId;

public class AsociarCuenta implements Command {

    private final TrabajadorId id;
    private final CuentaId idAccount;

    public AsociarCuenta(TrabajadorId id, CuentaId idAccount){
        this.id = id;
        this.idAccount = idAccount;
    }

    public TrabajadorId getId() {
        return id;
    }

    public CuentaId getIdAccount() {
        return idAccount;
    }
}
