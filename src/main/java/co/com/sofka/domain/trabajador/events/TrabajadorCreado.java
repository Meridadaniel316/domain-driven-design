package co.com.sofka.domain.trabajador.events;

import co.com.sofka.domain.cuenta.values.CuentaId;
import co.com.sofka.domain.trabajador.values.*;

import co.com.sofka.domain.generic.DomainEvent;

public class TrabajadorCreado extends DomainEvent {

    private CuentaId accountId;
    private final Nombres nombres;
    private final Apellidos apellidos;
    private final Identificacion identificacion;
    private final Horas horas;
    private final CategoriaId categoriaId;
    private final SueldoId sueldoId;

    public TrabajadorCreado(CuentaId accountId, Nombres nombres, Apellidos apellidos, Identificacion identificacion, Horas horas, CategoriaId categoriaId, SueldoId sueldoId){
        super("sofka.trabajador.TrabajadorCreado");
        this.accountId = accountId;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.horas = horas;
        this.categoriaId = categoriaId;
        this.sueldoId = sueldoId;
    }

    public CuentaId getAccountId() { return accountId; }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public SueldoId getSueldoId() {
        return sueldoId;
    }

    public Horas getHoras() {
        return horas;
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
}
