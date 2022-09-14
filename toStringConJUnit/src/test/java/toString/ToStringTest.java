package toString;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToStringTest {

	@Test
	public void test() {
		// AAA: Arrange, Act, and Assert
		Persona persona = new Persona("Diego", "Corsi");

		String identidad = persona.toString();
		
		assertEquals("Diego Corsi", identidad);
		
	}

}
