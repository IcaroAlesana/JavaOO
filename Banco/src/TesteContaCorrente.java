import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteContaCorrente {
	
	ContaCorrente cc;
	
	@BeforeEach
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}
	
	@Test
	public void deposito() {
		assertEquals(cc.saldo, 200);
	}
	
	@Test
	public void sacar() {
		float valorSacado = cc.sacar(150);
		assertEquals(cc.saldo, 50);
		assertEquals(valorSacado, 150);
	}
	
	@Test
	public void sacarMaior() {
		float valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}
}
