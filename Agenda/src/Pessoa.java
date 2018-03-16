import java.time.Period;
import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private double altura;
	private int idade;	
	LocalDate nasc;
	
	public Pessoa(String nome, LocalDate nascimento, double altura) {
		super();
		this.nome = nome;
		this.nasc = nascimento;
		this.altura = altura;
		this.idade = getIdade(nascimento);
	}
	
	protected String getNome() {
		return nome;
	}
	
	protected double getAltura() {
		return altura;
	}
	protected void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade(LocalDate nascimento) {
		LocalDate now = LocalDate.now();
		idade = Period.between(nascimento, now).getYears();
		return idade;
	}
	
	protected LocalDate getNasc() {
		return nasc;
	}
	
	protected void imprimirDados() {
		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nAltura: "+altura+"\n");
	}
	
}
