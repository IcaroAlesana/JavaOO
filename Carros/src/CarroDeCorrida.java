
public abstract class CarroDeCorrida {

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroDeCorrida(String nome, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}

	public String getNome() {
		return nome;
	}
	
	public abstract void acelerar();

	public void frear() {
		velocidade = velocidade/2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void imprimir() {
		System.out.println("O carro "+nome+" está andando a "+getVelocidade()+" km/h");		
	}

}
