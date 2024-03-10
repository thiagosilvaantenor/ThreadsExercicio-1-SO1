package view;

import controller.ThreadEx1Controller;

public class App {
	
	public static void main(String[] args) {
//		1) Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o
//		seu número (TID).
//		Dica: O número que deve ser impresso é a saída da operação int id = getId() da Thread.
		
		for(int i = 0; i <= 5; i++) {
			Thread tr = new ThreadEx1Controller();
			tr.start();
		}
	}
	
	
}
