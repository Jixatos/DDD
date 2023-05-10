package br.com.fiap.beans;

public class Leao extends Mamifero{

	private double tamanhoJuba;

	public Leao() {
		super();
	}
	
	public Leao(double tamanhoJuba) {
		super();
		this.tamanhoJuba = tamanhoJuba;
	}
	
	public Leao(String nome, String genero, double velocidade, int idade, double tamanhoJuba) {
		super(nome,genero,velocidade,idade);
		this.tamanhoJuba = tamanhoJuba;
	}

	public double getTamanhoJuba() {
		return tamanhoJuba;
	}
	public void setTamanhoJuba(double tamanhoJuba) {
		this.tamanhoJuba = tamanhoJuba;
	}
}
