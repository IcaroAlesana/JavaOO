import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {
	
	public double raiz (double x) {
		return Math.sqrt(x);
	}
	
	public double pot�ncia(double x, double y) {
		return Math.pow(x, y);
	}
}
