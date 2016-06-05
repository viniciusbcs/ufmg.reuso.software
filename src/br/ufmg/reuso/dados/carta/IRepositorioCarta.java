package br.ufmg.reuso.dados.carta;

import br.ufmg.reuso.negocio.carta.CartaBonificacao;
import br.ufmg.reuso.negocio.carta.CartaEngenheiro;
import br.ufmg.reuso.negocio.carta.CartaPenalizacao;

public interface IRepositorioCarta {
	
	CartaBonificacao obterCartaConceito(String nome);
	CartaPenalizacao obterCartaPenalizacao(String nome);
	CartaEngenheiro obterCartaEngenheiro(String nome);

}
