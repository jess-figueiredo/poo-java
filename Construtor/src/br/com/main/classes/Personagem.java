package br.com.main.classes;

import javax.swing.JOptionPane;

public class Personagem {
	//atributos de classe
	private String nome;
	private int nivel;
	private int forca;
	private int vida;
	private String classe;
	
	
	//metodos construtor
	public Personagem(String nome, String classe) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = 10;
		vida = nivel *5000;
		
		if(classe.equals("Guerreiro")) {
			forca = nivel * 2;
		}else {
			forca = nivel;
		}
	}
	
	


	//metodos especificos
	public void mostrarStatus() {
		String status = String.format("Nome: %s\nNíveç: %d\nVida: %d\nClasse: %s\nForça: %d",
				nome, nivel, vida, classe, forca);
		
		JOptionPane.showConfirmDialog(null, status);
	}
	
	//metodos getters and setters
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getNivel() {
		return nivel;
	}
	
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	public int getForca() {
		return forca;
	}
	
	
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	
	public int getVida() {
		return vida;
	}
	
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
	public String getClasse() {
		return classe;
	}
	
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
}
