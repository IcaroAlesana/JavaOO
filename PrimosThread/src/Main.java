
public class Main {

	public static void main(String[] args) {
		NumeroPrimo n1 = new NumeroPrimo(0,100);
		NumeroPrimo n2 = new NumeroPrimo(101,200);
		NumeroPrimo n3 = new NumeroPrimo(201,300);
		NumeroPrimo n4 = new NumeroPrimo(301,400);
		NumeroPrimo n5 = new NumeroPrimo(401,500);
		NumeroPrimo n6 = new NumeroPrimo(501,600);
		NumeroPrimo n7 = new NumeroPrimo(601,700);
		NumeroPrimo n8 = new NumeroPrimo(701,800);
		NumeroPrimo n9 = new NumeroPrimo(801,900);
		NumeroPrimo n10 = new NumeroPrimo(901,1000);

		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n2);
		Thread t3 = new Thread(n3);
		Thread t4 = new Thread(n4);
		Thread t5 = new Thread(n5);
		Thread t6 = new Thread(n6);
		Thread t7 = new Thread(n7);
		Thread t8 = new Thread(n8);
		Thread t9 = new Thread(n9);
		Thread t10 = new Thread(n10);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(4);
		t5.setPriority(5);
		t6.setPriority(6);
		t7.setPriority(7);
		t8.setPriority(8);
		t9.setPriority(9);
		t10.setPriority(10);

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Execução finalizada.");
		//NumeroPrimo p = new NumeroPrimo(4);

	}

}
