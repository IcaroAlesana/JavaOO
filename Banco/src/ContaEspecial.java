
public class ContaEspecial extends ContaCorrente{
	
	float limite;
	
	ContaEspecial(float limite) {
		this.limite = limite;
	}
	
	public float sacar(float valor) {		
		
		if (valor > (saldo + limite)) {
			return 0;
		}
		else {
			saldo -= valor;
			return valor;
		}
	}
}
