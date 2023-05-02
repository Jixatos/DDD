package br.com.fiap.beans;

public class Mamifero {
	
	private String nome;
	private String genero;
	private double velocidade;
	private int idade;

	public Mamifero() {
		super();
	}

	public Mamifero(String nome, String genero, double velocidade, int idade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.velocidade = velocidade;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
