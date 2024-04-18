import java.util.Timer;
import java.util.TimerTask;

public class EventosSistema {

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            int segundos = 0;

            @Override
            public void run() {
                System.out.println("Segundos transcurridos: " + segundos++);
            }
        };

        timer.scheduleAtFixedRate(tarea, 0, 1000); // Ejecutar la tarea cada segundo
    }
}