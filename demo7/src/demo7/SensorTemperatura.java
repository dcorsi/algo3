package demo7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SensorTemperatura {
    private final List<EscuchadorCambioTemperatura> listeners = new ArrayList<>();
    private double temperaturaActual;

    public SensorTemperatura(double temperaturaInicial) {
        this.temperaturaActual = temperaturaInicial;
    }

    public void agregarListener(EscuchadorCambioTemperatura listener) {
        listeners.add(listener);
    }

    public void removerListener(EscuchadorCambioTemperatura listener) {
        listeners.remove(listener);
    }

    public void simularCambioTemperatura() {
        Random random = new Random();
        double temperaturaAnterior = temperaturaActual;
        double temperaturaNueva = temperaturaAnterior + (random.nextDouble() * 10 - 5); // Cambio aleatorio de hasta +/- 5 grados
        temperaturaActual = temperaturaNueva;

        if (Math.abs(temperaturaNueva - temperaturaAnterior) >= 2) {
            // Emitir evento si hay un cambio significativo de temperatura
            EventoCambioTemperatura evento = new EventoCambioTemperatura(this, temperaturaAnterior, temperaturaNueva);
            for (EscuchadorCambioTemperatura listener : listeners) {
                listener.cambioTemperaturaDetectado(evento);
            }
        }
    }
}
