public class HWorld {
	public static void main(String[] args ) {
		Runnable r = new ThreadEx();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
}
