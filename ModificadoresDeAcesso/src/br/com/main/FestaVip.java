package br.com.main;

public class FestaVip {
	private int quantidadeCafe = 5;
	private int quantidadeSalgado = 22;
	
	public void entrar() {
		beberCafe();
		comerSalgado();
		
	}
	
	//<modificador> <retorno-m�todo> <nome-m�todo>
	private void beberCafe() {
		quantidadeCafe--;
		System.out.format("Bebeu %d x�cara de caf�", quantidadeCafe);
	}
	
	private void comerSalgado(){
		quantidadeSalgado++;
		System.out.format("Comeu %d Salgados", quantidadeSalgado);
	}
}
