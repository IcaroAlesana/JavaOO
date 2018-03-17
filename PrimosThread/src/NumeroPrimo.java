
public class NumeroPrimo implements Runnable {

	private int inicio;
	private int fim;

	public NumeroPrimo(int in, int j) {
		this.inicio = in;
		this.fim = j;		
	}
	public NumeroPrimo(int p) {
		isPrimo(p);
	}


	public void isPrimo(int j) {
		int cont = 0;
		for (int i = 1; i<=j; i++) {
			if (j%i==0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println(j);
		}
	}

	@Override
	public void run() {
		for(int i = inicio; i <= fim; i++) {
			isPrimo(i);
		}

	}

}
