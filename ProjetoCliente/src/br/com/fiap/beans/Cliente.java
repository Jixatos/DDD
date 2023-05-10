package br.com.fiap.beans;

public class Cliente {

	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private Produto produto;
	
	//Metodo Construtor
	public Cliente(String nome,int idade, double peso, double altura, Produto produto){
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.produto = produto;
	}
	
	//Getter and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
}
