package aula01;

import java.util.Random;

public class Personagem {
	//atributos: caracteristicas do objeto
	String nome;
	String tipo;
	float altura;
	String raca;
	int nivel;
	int forca;
	float velocidade;
	
	
	//métodos: o que o objeto pode fazer 
	public void correr(float velocidade){
		velocidade = velocidade / 10;
		
		if(velocidade == 0) {
			System.out.format("%s tropeçou e caiu.\n", nome);
		}else {
		System.out.format("%s correu a uma velocidade de %.1f K/h\n", nome, velocidade);
		
		}
		
	}
	
	int calcularDano() {
		Random gerador = new Random();
		int d20 = 1 + gerador.nextInt(19); //vai de 0 a 20, porém no dado n tem 0
		int dano = forca + d20;
		
		
		return dano;
	}
	
	void atacar(String alvo) {
		int danoCausado = calcularDano();
		
		System.out.format("%s atacou %s e causou %d de dano.\n",
				nome, alvo, danoCausado);
	}

	void defesaUnica(String alvo) {
		System.out.format("%s se defendeu de %s", nome, alvo);
	}
		
}
