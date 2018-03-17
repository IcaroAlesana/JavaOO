import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteCarroMulti {
	
	CarroDeCorrida c;
	
	@BeforeEach
	public void inicializaCarro() {
		c = new CarroMulti("Teste", 1.5, 100);		
	}
	
	@Test
	public void testeNome() {
		assertEquals(c.getNome(), "Teste");
	}
	
	@Test
	public void testeCarroParado() {
		assertEquals(c.getVelocidade(), 0);		
	}
	
	@Test
	public void testeAcelerar() {
		c.acelerar();
		assertEquals(c.getVelocidade(),10);
	}
	
	@Test
	public void testeAcelerar2x() {
		c.acelerar();
		c.acelerar();
		assertEquals(c.getVelocidade(),15);
	}
	
	@Test
	public void testeAcelerarAteVelocidadeMaxima() {
		for(int i=0; i<=15; i++)
			c.acelerar();
		assertEquals(c.getVelocidade(),100);
	}
	
	@Test
	public void testeFrear() {
		c.acelerar();
		c.frear();
		assertEquals(c.getVelocidade(), 5);
	}
	
	@Test
	public void testeFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(c.getVelocidade(), 0);
	}
	
	@Test
	public void testeImprimir() {
		c.acelerar();
		c.acelerar();
		c.frear();
		c.imprimir();
		assertEquals(c.getVelocidade(), 7);
	}
}
