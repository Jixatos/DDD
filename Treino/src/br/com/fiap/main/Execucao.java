package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Execucao {

	//Metodo Static
	static String texto(String j){
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
	
		//Instanciar objetos
		
		//String nome, String email, int idade, double renda, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica(
				texto("Digite o seu nome"),
				texto("Digite o seu email"),
				inteiro("Digite sua idade"),
				real("Digite a sua renda"),
				texto("Digite o seu rg"),
				texto("Digite o seu cpf") 
				);
		
		//String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(
				texto("Digite o seu nome"),
				texto("Digite o seu email"),
				inteiro("Digite sua idade"),
				real("Digite a sua renda"),
				texto("Digite a sua Razão Social"),
				texto("Digite o seu cnpj")
				);
		
		//String logradouro, int numero, String pais, String cidade, String municipio, String bairro
		Endereco objE = new Endereco(
				texto("logradouro: "),
				inteiro("numero: "),
				texto("País: "),
				texto("Cidade: "),
				texto("Município: "),
				texto("Bairro: ")
				);
		
		objPf.setEndereco(objE);
		objPj.setEndereco(objE);
		
		System.out.println("Nome: " + objPf.getNome() +
				"\nEmail: " + objPf.getEmail() +
				"\nIdade: " + objPf.getIdade() +
				"\nRenda: " + objPf.getRenda() +
				"\nEndereco: " + objPf.getEndereco() +
				"\nRG: " + objPf.getRg() +
				"\nCPF" + objPf.getCpf() +
				"\nNome: " + objPj.getNome() +
				"\nEmail: " + objPj.getEmail() +
				"\nIdade: " + objPj.getIdade() +
				"\nRenda: " + objPj.getRenda() +
				"\nEndereco: " + objPj.getEndereco() +
				"\nRazão Social: " + objPj.getRazaoSocial() +
				"\nCNPJ: " + objPj.getCnpj()
				);
		
	}
}
