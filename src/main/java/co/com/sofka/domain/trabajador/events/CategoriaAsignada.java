package co.com.sofka.domain.trabajador.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.trabajador.values.CategoriaId;

public class CategoriaAsignada extends DomainEvent {
    private final CategoriaId categoriaId;

    public CategoriaAsignada(CategoriaId categoriaId){
        super("sofka.trabajador.categoriaasignada");
        this.categoriaId = categoriaId;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }
}
