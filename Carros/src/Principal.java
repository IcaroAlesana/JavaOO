
public class Principal {

	public static void main(String[] args) {
		Corrida speedRace = new Corrida(2000);
		
		speedRace.adicionaCarro(new CarroSoma("carro1", 10, 110));
		speedRace.adicionaCarro(new CarroSoma("carro2", 8, 150));
		speedRace.adicionaCarro(new CarroMulti("carro3", 1.7, 100));
		speedRace.adicionaCarro(new CarroMulti("carro4", 1.5, 110));
		
		speedRace.inicio();
	}
}
