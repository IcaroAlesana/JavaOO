import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCalculadora {
	CalculadoraCientifica c;
	
	@BeforeEach
	public void antes() {
		c = new CalculadoraCientifica();		
	}
	
	@Test
	public void testeSoma() {
		assertEquals(c.soma(4, 6), 10.0);
	}
	
	@Test
	public void testeSubtração() {
		assertEquals(c.subtração(6, 4), 2.0);
	}
	
	@Test
	public void testeMultiplicação() {
		assertEquals(c.multiplicação(2, 5), 10.0);
	}
	
	@Test
	public void testeDivisão() {
		assertEquals(c.divisão(4, 2), 2.0);
	}
	
	@Test
	public void testePotência() {
		assertEquals(c.potência(5, 2), 25.0);
	}
	
	@Test
	public void testeRaiz() {
		assertEquals(c.raiz(4), 2.0);
	}

}
