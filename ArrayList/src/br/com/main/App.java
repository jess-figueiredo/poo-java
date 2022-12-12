package br.com.main;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		String[] arrayEstatico = new String[5];
		arrayEstatico[0] = "Maria";
		arrayEstatico[1] = "Kezia";
		arrayEstatico[2] = "Maria";
		arrayEstatico[3] = "Kira";
		arrayEstatico[4] = "Tonha";
		
		
		ArrayList<String> arrayDinamico = new ArrayList<String>();
		arrayDinamico.add("Goku");
		arrayDinamico.add("Buma");
		arrayDinamico.add("Thanks");
		arrayDinamico.add("Luffy");
		arrayDinamico.add("Ney");
		arrayDinamico.add("Jess");
		
		System.out.println("Imprimindo o arrayEstatico");
		for(int i = 0 ; i < arrayEstatico.length ; i++) {
			System.out.println(arrayEstatico[i]);
		}
		/*
		System.out.println("Removendo o Ney.");
		arrayDinamico.remove(4);
		arrayDinamico.clear();
		
		System.out.println("\nImprimindo o arrayDinamico");
		for(int i = 0 ; i < arrayDinamico.size() ; i++) {
			System.out.println(arrayDinamico.get(i));
		} */
		
		//for it 
		for(String nome : arrayDinamico) {
			System.out.println(nome);
		}
	}

}
