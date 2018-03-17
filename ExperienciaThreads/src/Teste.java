
public class Teste {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start();	

		@SuppressWarnings("unused")
		MinhaThread thread2 = new MinhaThread("Thread #2", 800);
		
		@SuppressWarnings("unused")
		MinhaThread thread3 = new MinhaThread("Thread #3", 1000);
	}
}
