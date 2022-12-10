package br.com.main;

public class FestaVip {
	private int quantidadeCafe = 5;
	private int quantidadeSalgado = 22;
	
	public void entrar() {
		beberCafe();
		comerSalgado();
		
	}
	
	//<modificador> <retorno-método> <nome-método>
	private void beberCafe() {
		quantidadeCafe--;
		System.out.format("Bebeu %d xícara de café", quantidadeCafe);
	}
	
	private void comerSalgado(){
		quantidadeSalgado++;
		System.out.format("Comeu %d Salgados", quantidadeSalgado);
	}
}
