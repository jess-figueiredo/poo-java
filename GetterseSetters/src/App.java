import br.com.main.classes.*;

public class App {

	public static void main(String[] args) {
	/*	Pessoa pessoa = new Pessoa();
		pessoa.setNome("Joyce");
		pessoa.setIdade(90);
		pessoa.setAltura(1.5);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getAltura());
		System.out.println(pessoa.getIdade()); */
	
	Conta conta = new Conta();
	System.out.println(conta.getSaldo());
	conta.depositar(500);
	System.out.println(conta.getSaldo());
	
	}

}
