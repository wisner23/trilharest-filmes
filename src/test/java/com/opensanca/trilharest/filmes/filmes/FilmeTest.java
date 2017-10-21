package com.opensanca.trilharest.filmes.filmes;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class FilmeTest {
	
	@Test
	public void foraDeExibicaoSeDatasNulas() {
		// preparação
		Filme filme = new Filme();
		
		//processamento
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		//verificacao
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void emExibicaoSeDentroDeIntervaloDeDados() {
		// preparação
		Filme filme = new Filme(null,null,null,null,
				LocalDate.of(2017, 10, 1),
				LocalDate.of(2017, 10, 30));
		
		//processamento
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		//verificacao
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void ForaDeExibicaoSeDentroDeIntervaloDeDados() {
		// preparação
		Filme filme = new Filme(null,null,null,null,
				LocalDate.of(2016, 10, 1),
				LocalDate.of(2016, 10, 30));
		
		//processamento
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		//verificacao
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void EmExibicaoSeInicioExatamenteHoje() {
		// preparação
		Filme filme = new Filme(null,null,null,null,
				LocalDate.of(2017, 10, 21),
				LocalDate.of(2017, 10, 30));
		
		//processamento
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		//verificacao
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void ForaDeExibicaoSeInicioExibicaoNulo() {
		// preparação
		Filme filme = new Filme(null,null,null,null,
				null,
				LocalDate.of(2016, 10, 30));
		
		//processamento
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		//verificacao
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void ForaDeExibicaoSeTerminoExibicaoNulo() {
		// preparação
		Filme filme = new Filme(null,null,null,null,
				LocalDate.of(2016, 10, 1),
				null);
		
		//processamento
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		//verificacao
		Assert.assertFalse(resultado);
	}
}
