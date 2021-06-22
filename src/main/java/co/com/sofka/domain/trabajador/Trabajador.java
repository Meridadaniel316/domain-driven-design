package co.com.sofka.domain.trabajador;

import co.com.sofka.domain.cuenta.values.CuentaId;
import co.com.sofka.domain.trabajador.events.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.trabajador.values.*;

import java.util.List;

public class Trabajador extends AggregateEvent<TrabajadorId> {
    protected CuentaId accountId;
    protected Nombres nombres;
    protected Apellidos apellidos;
    protected Identificacion identificacion;
    protected Horas horas;
    protected CategoriaId categoriaId;
    protected SueldoId sueldoId;

    public Trabajador(TrabajadorId entityId) {
        super(entityId);
    }

    public Trabajador(TrabajadorId entityId, CuentaId accountId, Nombres nombres, Apellidos apellidos, Identificacion identificacion, Horas horas, CategoriaId categoriaId, SueldoId sueldoId){
        super(entityId);
        this.accountId = accountId;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.horas = horas;
        this.categoriaId = categoriaId;
        this.sueldoId = sueldoId;
        appendChange(new TrabajadorCreado(accountId, nombres, apellidos, identificacion, horas, categoriaId, sueldoId)).apply();
    }

    public static Trabajador from(TrabajadorId id, List<DomainEvent> retrieveEvents) {
        var trabajador = new Trabajador(id);
        retrieveEvents.forEach(trabajador::applyEvent);
        return trabajador;
    }
    public void asociarCuenta(CuentaId cuentaId){
        appendChange(new co.com.sofka.domain.cliente.events.CuentaAsociada(cuentaId)).apply();
    }

    public void cambiarNombres(Nombres nombres){
        appendChange(new NombresCambiados(nombres)).apply();
    }

    public void cambiarApellidos(Apellidos apellidos){
        appendChange(new ApellidosCambiados(apellidos)).apply();
    }

    public void cambiarIdentificacion(Identificacion identificacion){
        appendChange(new IdentificacionCambiada(identificacion)).apply();
    }

    public void incrementarHoras(Horas horas){
        appendChange(new HorasIncrementadas(horas)).apply();
    }

    public void asignarSueldo(SueldoId sueldo){
        appendChange(new SueldoAsignado(sueldo)).apply();
    }

    public void obtenerCategoria(CategoriaId categoriaId){
        appendChange(new CategoriaAsignada(categoriaId)).apply();
    }
}
