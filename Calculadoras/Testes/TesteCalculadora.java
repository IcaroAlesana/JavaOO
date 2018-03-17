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
	public void testeSubtra��o() {
		assertEquals(c.subtra��o(6, 4), 2.0);
	}
	
	@Test
	public void testeMultiplica��o() {
		assertEquals(c.multiplica��o(2, 5), 10.0);
	}
	
	@Test
	public void testeDivis�o() {
		assertEquals(c.divis�o(4, 2), 2.0);
	}
	
	@Test
	public void testePot�ncia() {
		assertEquals(c.pot�ncia(5, 2), 25.0);
	}
	
	@Test
	public void testeRaiz() {
		assertEquals(c.raiz(4), 2.0);
	}

}
