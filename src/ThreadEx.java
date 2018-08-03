
//class ThreadEx extends Thread {
class ThreadEx implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
//		System.out.println(this.getName());
	}

}
