import java.util.ArrayList;
import java.time.LocalDate;

public class Agenda {
	
	private ArrayList<Pessoa> pessoas;
	
	protected Agenda () {
		pessoas = new ArrayList<Pessoa>();
	}
	
	protected void armazenaPessoa(String nome, LocalDate nascimento, double altura) {
		getPessoa().add(new Pessoa(nome, nascimento, altura));
	}
	
	protected int buscaPessoa(String nome) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getNome() == nome) {
				return pessoas.indexOf(pessoa);
			}
		}
		return -1;
	}
	
	protected void removePessoa(String nome) {
		boolean rem = false;
		for(int i = pessoas.size() - 1; i>= 0; i--) {
			Pessoa pessoa = pessoas.get(i);
			if(pessoa.getNome() == nome) {
				System.out.println(pessoa.getNome() + " foi removido com sucesso");
				pessoas.remove(i);
				rem = true;
			}			
		}
		if (rem == false) {
			System.out.println("Nome não encontrado.");
		}
	}
	
	protected void imprimeAgenda() {
		for(Pessoa pessoa : pessoas) {
			pessoa.imprimirDados();
		}
	}

	protected void imprimePessoa(int index) {
		Pessoa pessoa = pessoas.get(index);
		pessoa.imprimirDados();
	}

	protected  ArrayList<Pessoa> getPessoa() {
		return pessoas;
	}

	protected void setPessoa(ArrayList<Pessoa> pessoa) {
		this.pessoas = pessoa;
	}
}
