package algo3;

public class Main {

	public static void main(String[] args) {

		Television tv = new Television();

		System.out.println("Secuencia de teclas del control remoto de TV presionadas:");
		System.out.println("Off -> Mute -> On -> On -> Mute -> Mute -> On -> Off");
		System.out.println();

		tv.executeOffButton(); System.out.println("Estado: " + tv.getCurrentState());
		tv.executeMuteButton(); System.out.println("Estado: " + tv.getCurrentState());
		tv.executeOnButton(); System.out.println("Estado: " + tv.getCurrentState());
		tv.executeOnButton(); System.out.println("Estado: " + tv.getCurrentState());
		tv.executeMuteButton(); System.out.println("Estado: " + tv.getCurrentState());
		tv.executeMuteButton(); System.out.println("Estado: " + tv.getCurrentState());
		tv.executeOnButton(); System.out.println("Estado: " + tv.getCurrentState());
		tv.executeOffButton(); System.out.println("Estado: " + tv.getCurrentState());
	}
}
