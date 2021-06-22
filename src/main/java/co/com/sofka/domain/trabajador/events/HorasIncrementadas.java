package co.com.sofka.domain.trabajador.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.trabajador.values.Horas;

public class HorasIncrementadas extends DomainEvent {

    private final Horas horas;

    public HorasIncrementadas(Horas Horas){
        super("sofka.trabajador.horasincrementadas");
        this.horas = Horas;
    }

    public Horas getHoras() {
        return horas;
    }
}
