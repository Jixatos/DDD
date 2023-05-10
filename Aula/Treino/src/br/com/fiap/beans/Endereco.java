package br.com.fiap.beans;

public class Endereco {

	private String logradouro;
	private int numero;
	private String pais;
	private String cidade;
	private String municipio;
	private String bairro;
	
	
	//Metodo construtr vazio
	public Endereco() {
		super();
	}
	//Metodo construtor cheio
	public Endereco(String logradouro, int numero, String pais, String cidade, String municipio, String bairro) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.pais = pais;
		this.cidade = cidade;
		this.municipio = municipio;
		this.bairro = bairro;
	}
	
	//Getters and Setters
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	
}
