package demo7;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura(25.0);

        // Escuchador 1: Imprimir cambios de temperatura
        sensorTemperatura.agregarListener(new EscuchadorCambioTemperatura() {
            @Override
            public void cambioTemperaturaDetectado(EventoCambioTemperatura evento) {
                double temperaturaAnterior = evento.getTemperaturaAnterior();
                double temperaturaNueva = evento.getTemperaturaNueva();
                System.out.println("Escuchador 1 - Cambio de temperatura detectado: " + temperaturaAnterior + " -> " + temperaturaNueva);
            }
        });

        // Escuchador 2: Notificar si la temperatura es muy alta
        sensorTemperatura.agregarListener(new EscuchadorCambioTemperatura() {
            @Override
            public void cambioTemperaturaDetectado(EventoCambioTemperatura evento) {
                double temperaturaNueva = evento.getTemperaturaNueva();
                if (temperaturaNueva > 25.0) {
                    System.out.println("Escuchador 2 - ¡Advertencia! Temperatura alta: " + temperaturaNueva + "°C");
                }
            }
        });

        // Escuchador 3: Registrar cambios de temperatura en un log (simulado aquí con un print)
        sensorTemperatura.agregarListener(new EscuchadorCambioTemperatura() {
            @Override
            public void cambioTemperaturaDetectado(EventoCambioTemperatura evento) {
                System.out.println("Escuchador 3 - Registro de cambio: Temperatura anterior: " + evento.getTemperaturaAnterior() +
                        "°C, Temperatura nueva: " + evento.getTemperaturaNueva() + "°C");
            }
        });

        // Simular cambios de temperatura
        for (int i = 1; i <= 10; i++) {
            System.out.println("Dia " + i + ": ");
            sensorTemperatura.simularCambioTemperatura();
            try {
                Thread.sleep(1000); // Simular cambios cada segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
