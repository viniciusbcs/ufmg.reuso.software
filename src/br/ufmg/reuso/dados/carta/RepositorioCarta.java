package br.ufmg.reuso.dados.carta;

import java.util.Properties;

import br.ufmg.reuso.dados.RepositorioArquivo;
import br.ufmg.reuso.negocio.carta.CartaBonificacao;
import br.ufmg.reuso.negocio.carta.CartaPenalizacao;

public class RepositorioCarta extends RepositorioArquivo implements IRepositorioCarta {

	@Override
	public CartaBonificacao obterCartaConceito(String nome) {

		Properties a = getArquivoProperties(nome);
		
		CartaBonificacao c = new CartaBonificacao(a.getProperty("titulo"),a.getProperty("codigo"),a.getProperty("texto"),
				a.getProperty("referenciaBibliografica"),Integer.parseInt(a.getProperty("duracaoEfeito")),
				Integer.parseInt(a.getProperty("custo")),Integer.parseInt(a.getProperty("tipoPrimeiroEfeito")),
				Integer.parseInt(a.getProperty("tipoSegundoEfeito")),Integer.parseInt(a.getProperty("quantidadePrimeiroEfeito")),
				Integer.parseInt(a.getProperty("quantidadeSegundoEfeito"))); 

		return c;
	}
	
	@Override
	public CartaPenalizacao obterCartaPenalizacao(String nome) {
		
		Properties a = getArquivoProperties(nome);
		
		CartaPenalizacao c = new CartaPenalizacao(a.getProperty("titulo"),a.getProperty("codigo"),a.getProperty("texto"),
				a.getProperty("referenciaBibliografica"),Integer.parseInt(a.getProperty("duracaoEfeito")),
				a.getProperty("condicao"),Integer.parseInt(a.getProperty("tipoPrimeiroEfeito")),
				Integer.parseInt(a.getProperty("tipoSegundoEfeito")),Integer.parseInt(a.getProperty("quantidadePrimeiroEfeito")),
				Integer.parseInt(a.getProperty("quantidadeSegundoEfeito")),Integer.parseInt(a.getProperty("tipoPrimeiraCondicao")),
				Integer.parseInt(a.getProperty("tipoSegundaCondicao")),Integer.parseInt(a.getProperty("quantidadePrimeiraCondicao")),
				Integer.parseInt(a.getProperty("quantidadeSegundaCondicao"))); 
		
		return c;
	}

}
