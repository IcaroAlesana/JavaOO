import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Cristofolini", "senhadoicaro");
		assertEquals("Cristofolini", u.getLogin());
	}
	
	@Test
	public void loginFalho(){
		Autenticador a = new Autenticador();
		Assertions.assertThrows(LoginException.class, () -> {
			a.logar("Cristofolini", "senhadoJose");
		});
	}
	
	@Test
	public void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			a.logar("Cristofolini", "senhadoJose");
			fail();
		} catch(LoginException e) {
			assertEquals("Cristofolini", e.getLogin());
		}
	}
}
