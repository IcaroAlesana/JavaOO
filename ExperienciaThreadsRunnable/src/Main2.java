
public class Main2 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 250);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 750);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.setPriority(1);
		t2.setPriority(3);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
