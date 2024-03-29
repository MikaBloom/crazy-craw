package br.com.caelum.cap11.banco.model;

public class DadosPessoais {
	
	String nome;
	String endereco;
	String cpf;
	String rg;	
	Data nascimento;
	
	public DadosPessoais() {}
	
	public DadosPessoais(String nome, String endereco, String cpf, String rg,
			Data nascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "DadosPessoais [nome=" + nome + ", endereco=" + endereco
				+ ", cpf=" + cpf + ", rg=" + rg + ", nascimento=" + nascimento
				+ "]";
	}
	
	
	
	

}
