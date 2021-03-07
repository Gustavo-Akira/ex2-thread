package main.thread;

public class CustomThread extends Thread{
	@Override
	public void run() {
		main();
		this.interrupt();
	}
	
	private void main() {
		System.out.println(getId());
	}
}
