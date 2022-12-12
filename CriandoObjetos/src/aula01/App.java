
package aula01;

public class App {

	public static void main(String[] args) throws Exception {
		Personagem mago = new Personagem();
		
		mago.nome = "Kim";
		mago.nivel = 43;
		mago.raca = "Humano";
		mago.velocidade = 40;
		mago.forca = 134;
		
		
		mago.correr(mago.velocidade);	
		mago.atacar("Flecheiro");
		mago.defesaUnica("Hydra");
		
	}

}


