package br.com.fiap.beans;

public class Pessoa {
	
	//Variaveis
	private String nome;
	private String email;
	private int idade;
	private double renda;
	private Endereco endereco;
	
	//Metodo construtor vazio
	public Pessoa() {
		super();
	}
	
	//Metodo construtor cheio
	public Pessoa(String nome, String email, int idade, double renda, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
		this.endereco = endereco;
	}
	
	//Metodo construtor cheio sem atributo de referencia
	public Pessoa(String nome, String email, int idade, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String identificador() {
		return "Sem identificação";
	}
	
}


