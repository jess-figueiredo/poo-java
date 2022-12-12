package br.com.main;

import br.com.main.classes.*;

public class App {
	public static void main(String[] args) throws Exception {
		//Encapsulamento
		VideoGame xDevOne = new VideoGame();
		xDevOne.ligar();
		xDevOne.jogar(new Xadrez());
		xDevOne.fechar();
	}
}
