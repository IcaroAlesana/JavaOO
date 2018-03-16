
public class ContaCorrente {
	
	float saldo;
	
	public float sacar(float valor) {
		
		if (valor > saldo) {
			return 0;
		}
		else {
			saldo -= valor;
			return valor;
		}
		
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}
}
