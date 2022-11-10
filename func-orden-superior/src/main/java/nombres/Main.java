package nombres;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("Dolores", "Diego", "Santiago", "Mario", "Daniel", "Silvia", "Rita");

		lista.stream().filter(s -> s.startsWith("D")).map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}

