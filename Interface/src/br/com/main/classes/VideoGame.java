package br.com.main.classes;

public class VideoGame {
	private Jogo jogo; //null caso vazio
	private boolean estaLigado;
	
	public void ligar() {
		System.out.println("Ligando o Video-Game...");
		this.estaLigado = true;
	}
	public void jogar(Jogo jogo) {//com o tipo jogo, qualquer jogo passa
		if(estaLigado) {
		System.out.println("Iniciando o jogo...");
		this.jogo = jogo;
		}else {
			System.out.println("Vide Game esta desligado.");
		}
	}
	public void fechar() {
		if(estaLigado) {
											System.out.println("Fechando o jogo...");
											boolean temJogoRodando = jogo != null;
											if(temJogoRodando) {
												jogo.fechar();
												jogo = null;
											}else {
												System.out.println("Não tem nenhum jogo rodando!");
											}
	
		}else {
				System.out.println("Vide Game esta desligado.");
			}
	}
}
