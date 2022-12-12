package br.com.main;

import javax.swing.JOptionPane;

import br.com.main.classes.*;

public class App {

	public static void main(String[] args) throws Exception {
		//Pessoa pessoa = new Pessoa("Jonata", 33, 1.72f);
		//pessoa.imprimirDados();
		
		String nome = JOptionPane.showInputDialog(null, "Nome do personagem:");
		String classe = JOptionPane.showInputDialog(null, "Classe do personagem:");
		
		Personagem personagem = new Personagem(nome, classe);
		
		personagem.mostrarStatus();
	}

}
