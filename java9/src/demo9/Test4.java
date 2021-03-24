package demo9;

public class Test4 extends Thread {
	
		public static  int amount = 0;
		public static void main(String[] args) {
	       Test4 t = new Test4();
	       Test5 obj = new Test5();
			Thread t5 = new Thread(obj);
		t.start();
	    t5.start();
		t5.isAlive();
		//t5.setPriority(MAX_PRIORITY);
		//t3.setPriority(MIN_PRIORITY);
		//t3.setPriority(NORM_PRIORITY);
			for(int i=0;i<=2;i++) {
			System.out.println("Alive is Running");
			
		}
		
		System.out.println(amount);
		amount++;
		System.out.println(amount);
		}
		public void run() {
			for(int i=0;i<=5;i++) {
				System.out.println("This code is Running");
				}
				amount++;
				System.out.println(amount);
			}
	}
 class Test5 implements  Runnable{

		public void run() {
	     System.out.println("Thread is Running");
		}
}