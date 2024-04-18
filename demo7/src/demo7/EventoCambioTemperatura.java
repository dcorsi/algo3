package demo7;

import java.util.EventObject;

public class EventoCambioTemperatura extends EventObject {
    private final double temperaturaAnterior;
    private final double temperaturaNueva;

    public EventoCambioTemperatura(Object source, double temperaturaAnterior, double temperaturaNueva) {
        super(source);
        this.temperaturaAnterior = temperaturaAnterior;
        this.temperaturaNueva = temperaturaNueva;
    }

    public double getTemperaturaAnterior() {
        return temperaturaAnterior;
    }

    public double getTemperaturaNueva() {
        return temperaturaNueva;
    }
}
