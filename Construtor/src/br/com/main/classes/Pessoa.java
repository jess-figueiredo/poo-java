package br.com.main.classes;

public class Pessoa {
	private String nome;
	private int idade;
	private float altura;
	
	//metodo construtor
	//<visibilidade> <nomeDaClasse>
	public Pessoa(String nome, int idade, float altura) {
		System.out.println("Uma pessoa acaba de nascer!");
		System.out.println("Parabéns!");
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		
	}
	
	public void imprimirDados() {
		System.out.format("Nome: %s\nidade: %d\nAltura: %.2f", 
				nome, idade, altura);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	//metodos getts e setts
	
}
