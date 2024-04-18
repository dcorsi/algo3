package demo7;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura(25.0);

        // Agregar un escuchador de eventos de cambio de temperatura
        sensorTemperatura.agregarListener(new EscuchadorCambioTemperatura() {
            @Override
            public void cambioTemperaturaDetectado(EventoCambioTemperatura evento) {
                double temperaturaAnterior = evento.getTemperaturaAnterior();
                double temperaturaNueva = evento.getTemperaturaNueva();
                System.out.println("Cambio de temperatura detectado: " + temperaturaAnterior + " -> " + temperaturaNueva);
            }
        });

        // Simular cambios de temperatura
        for (int i = 0; i < 10; i++) {
            sensorTemperatura.simularCambioTemperatura();
            try {
                Thread.sleep(1000); // Simular cambios cada segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}