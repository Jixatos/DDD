package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa{

	//private
	private String razaoSocial;
	private String cnpj;
	
	//Metodo Construtor Vazio
	public PessoaJuridica() {
		super();
	}
	
	//Metodo Construtor cheio
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	//Metodo Construtor com herança
	public PessoaJuridica(String nome, String email, int idade, double renda, String razaoSocial, String cnpj) {
		super(nome, email, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	//Gettters and Setters
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
	public String identificador (){
		return "PJ";
	}
}
