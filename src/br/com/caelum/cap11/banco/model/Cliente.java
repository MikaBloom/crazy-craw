package br.com.caelum.cap11.banco.model;

public class Cliente {

	DadosPessoais dp;
	
	public Cliente() {
		dp = new DadosPessoais();		
	}

	public DadosPessoais getDp() {
		return dp;
	}

	public void setDp(DadosPessoais dp) {
		this.dp = dp;
	}
	
	public void setNome(String nome){
		this.dp.setNome(nome);
	}
	
	public void setEndereco(String endereco){
		this.dp.setEndereco(endereco);
	}
	
	public void setCpf(String cpf){
		this.dp.setCpf(cpf);
	}

	public void setRg(String rg){
		this.dp.setRg(rg);
	}
	
	public void setDataNascimento(int dia, int mes, int ano){
		this.dp.nascimento = new Data(dia, mes, ano);
	}
	
	@Override
	public String toString() {
		return "Cliente [dp=" + dp + "]";
	}
	
	
	
}
