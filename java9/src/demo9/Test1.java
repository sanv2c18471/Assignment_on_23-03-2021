package demo9;

public class Test1 {
public static void main(String[] args) {
	NewThread t1 = new NewThread();
	t1.start();
	System.out.println("This code is Running");
}
}
class NewThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
		System.out.println("Thread is Running");	
	}
}
}