package demo9;

public class Test2 {
public static void main(String[] args) {
	Main1 obj = new Main1();
	Thread t2 = new Thread (obj);
	t2.start();
	System.out.println("Outside Run");
	}
}
class Main1 implements Runnable{
	public void run() {
		System.out.println("Thread is Running");
	}
}