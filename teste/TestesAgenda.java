import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestesAgenda {
	
	Agenda agenda;
	
	@BeforeEach
	public void inicio() {
	agenda = new Agenda();
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	agenda.armazenaPessoa("Icaro", LocalDate.parse("12/11/1993", formato), 1.7);
	agenda.armazenaPessoa("Aline", LocalDate.parse("27/01/1975", formato), 1.55);
	agenda.armazenaPessoa("Jose", LocalDate.parse("16/10/1970", formato), 1.67);
	agenda.armazenaPessoa("Roger", LocalDate.parse("08/12/2006", formato), 1.35);
	}
	
	@Test
	public void testePesquisa() {
		/*int index;		
		index = agenda.buscaPessoa("Roger");
		System.out.println(index);
		
		if(index == -1) {
			System.out.println("Nome não encontrado");
		}
		else {
			agenda.imprimePessoa(index);
		}*/	
	}
	
	@Test
	public void testeRemove() {
	agenda.removePessoa("Roger");
	agenda.imprimeAgenda();
	}
	
	/*@Test
	public void testeImpressao() {
		agenda.imprimeAgenda();
	}*/

}
