
public class CarroSoma extends CarroDeCorrida{
	
	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		if ((velocidade + potencia) <= velocidadeMaxima)
			velocidade += potencia;
		else velocidade = velocidadeMaxima;
	}
}
