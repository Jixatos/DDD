package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Humano;
import br.com.fiap.beans.Leao;

public class Execu��o {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		//String nome, String genero, double velocidade, int idade, double tamanhoJuba
		Leao objLeao = new Leao(
			texto("Digite o nome do Le�o: "),
			texto("Digite o genero do Le�o:"),
			real("Digite a velocidade do Le�o: "),
			inteiro("Digite a idade do Le�o:"),
			real("Digite o tamanho da Juba do le�o:"));
		
		//String nome, String genero, double velocidade, int idade, String rg
		Humano objHumano = new Humano(
			texto("Digite o nome: "),
			texto("Digite o genero: "),
			real("Digite a velocidade: "),
			inteiro("Digite a idade: "),
			texto("Digite o Rg: ")
		);
		
		System.out.println(
				"\n________________" + "\n--------Le�o--------" + "\n________________" +
				"\nNome:" + objLeao.getNome() +
				"\nGenero: " + objLeao.getGenero() +
				"\nVelocidade: " + objLeao.getVelocidade() +
				"\nIdade: " + objLeao.getIdade() +
				"\nTamanho da Juba: " + objLeao.getTamanhoJuba() +
				"\n________________" + "\n--------Humano--------" + "\n________________" +
				"\nNome:" + objHumano.getNome() +
				"\nGenero: " + objHumano.getGenero() +
				"\nVelocidade: " + objHumano.getVelocidade() + "km/h" + 
				"\nIdade: " + objHumano.getIdade() +
				"\nRG: " + objHumano.getRg()		
		);
	}

}
