package main;

import main.thread.CustomThread;

public class Main {
	public static void main(String[] args) {
		CustomThread thread = new CustomThread();
		CustomThread thread2 = new CustomThread();
		CustomThread thread3 = new CustomThread();
		CustomThread thread4 = new CustomThread();
		CustomThread thread5 = new CustomThread();
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
