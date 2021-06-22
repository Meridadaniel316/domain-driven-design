package co.com.sofka.domain.trabajador;

import co.com.sofka.domain.cliente.events.CuentaAsociada;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.trabajador.events.TrabajadorCreado;

public class TrabajadorChange extends EventChange {
    public TrabajadorChange(Trabajador trabajador) {
        apply((TrabajadorCreado event) -> {
            trabajador.categoriaId = event.getCategoriaId();
            trabajador.apellidos = event.getApellidos();
            trabajador.nombres = event.getNombres();
            trabajador.identificacion = event.getIdentificacion();
            trabajador.horas = event.getHoras();
            trabajador.sueldoId = event.getSueldoId();
        });

        apply((CuentaAsociada event) -> {
            trabajador.accountId = event.getCuentaId();
        });

    }

}
