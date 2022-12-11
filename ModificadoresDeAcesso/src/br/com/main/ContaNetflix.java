package br.com.main;

public class ContaNetflix {
	private String idiomaPreferencial;
	private String resolucaoTela;


void entrar() {
	buscarPreferenciasDoUsuario();
	identificarResolucao();
}

private void buscarPreferenciasDoUsuario() {
	idiomaPreferencial = "PT-BR";
}

private void identificarResolucao() {
	resolucaoTela = "Full HD";
}

void assistirFilme(String nomeFilme) {
	System.out.println("Iniciando o filme " + nomeFilme );
	System.out.println("Carregando o filme na resolução" + resolucaoTela);
	carregarAudio();
	
}

private void carregarAudio(){
	if(idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
		System.out.println("O audio esta sendo carregado no idioma " + idiomaPreferencial);
	}else {
		
		System.out.println("Carregando o audio em EN-US");
	}
}

}
