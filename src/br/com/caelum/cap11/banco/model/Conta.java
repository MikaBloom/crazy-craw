package br.com.caelum.cap11.banco.model;

import java.math.BigDecimal;

public interface Conta {

	void deposita(BigDecimal valor);
	
	void saca(BigDecimal valor);
	
	BigDecimal getSaldo();
	
}
