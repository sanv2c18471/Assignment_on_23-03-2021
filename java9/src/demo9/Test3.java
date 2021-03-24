package demo9;

public class Test3 extends Thread {
	public static int amount = 0;
	public static void main(String[] args) {
    Test3 t3 = new Test3();
	t3.start();
	t3.isAlive();
	//t3.setPriority(MAX_PRIORITY);
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
		System.out.println("Thread is Running");
		}
		amount++;
		System.out.println(amount);
	}
}
