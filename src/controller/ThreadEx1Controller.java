package controller;

public class ThreadEx1Controller extends Thread {

	public ThreadEx1Controller() {
		super();
	}

	@Override
	public void run() {
		int id = (int) getId();
		System.out.println("O ID da Thread é: " + id);
	}
}
