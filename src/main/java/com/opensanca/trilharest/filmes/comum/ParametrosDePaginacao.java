package com.opensanca.trilharest.filmes.comum;

public class ParametrosDePaginacao {
	
	private Integer pagina;
	private Integer tamanhoDaPagina;
	
	public ParametrosDePaginacao() {
		this.pagina = 1;
		this.tamanhoDaPagina = 3;
	}
	
	public Integer getPagina() {
		return pagina;
	}
	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}
	public Integer getTamanhoDaPagina() {
		return tamanhoDaPagina;
	}
	public void setTamanhoDaPagina(Integer tamanhoDaPaginacao) {
		this.tamanhoDaPagina = tamanhoDaPaginacao;
	}
	
	
}
