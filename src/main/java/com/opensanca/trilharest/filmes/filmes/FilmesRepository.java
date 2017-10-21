package com.opensanca.trilharest.filmes.filmes;

import java.time.LocalDate;
import java.util.UUID;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;

public interface FilmesRepository {
	Pagina<Filme> buscarPaginaEmExibicao(ParametrosDePaginacao parametrosDePaginacao, LocalDate referencia);
	
	/**
	 * 
	 *@throws IllegalAccessException Id nao encontrado
	 */
	Filme buscarPorId(UUID id);
}
