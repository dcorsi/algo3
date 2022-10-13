package algo3;

public class Main {

	public static void main(String[] args) {

		MensajeAbstracto mensaje = new Mensaje("el mensaje es Hola, mundo!");
		System.out.print("Mensaje original:\n    ");
		System.out.println(mensaje.getTexto());

		MensajeAbstracto expanded = new Expanded(mensaje);
		System.out.print("Mensaje expandido:\n    ");
		System.out.println(expanded.getTexto());

		MensajeAbstracto camelCase = new CamelCase(mensaje);
		System.out.print("Mensaje en camel case:\n    ");
		System.out.println(camelCase.getTexto());

		MensajeAbstracto expandedCamelCase = new Expanded(new CamelCase(mensaje));
		System.out.print("Mensaje en camel case y expandido:\n    ");
		System.out.println(expandedCamelCase.getTexto());

		MensajeAbstracto camelCaseExpanded = new CamelCase(new Expanded(mensaje));
		System.out.print("Mensaje expandido y en camel case:\n    ");
		System.out.println(camelCaseExpanded.getTexto());
	}
}
