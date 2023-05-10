package br.com.fiap.beans;

public class Humano extends Mamifero{

	private String rg;
	
	public Humano() {
		super();
	}
	
	public Humano(String rg) {
		super();
		this.rg = rg;
	}
	
	public Humano(String nome, String genero, double velocidade, int idade, String rg) {
		super(nome,genero,velocidade,idade);
		this.rg = rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getRg(){
		return rg;
	}
}
