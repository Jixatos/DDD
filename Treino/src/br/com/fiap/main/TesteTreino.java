package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteTreino {

	public static void main(String[] args) {
		
		
		
		Empresa objEmpresa = new Empresa(
			JOptionPane.showInputDialog("Digite o nome da empresa: "),
			JOptionPane.showInputDialog("Digite o tipo da empresa: "),
			JOptionPane.showInputDialog("Digite o CNPJ: ")
		);
		
		//(String logradouro, int numero, String cep, String bairro, String municipio, String estado)
		Endereco objEndereco = new Endereco(
			JOptionPane.showInputDialog("Digite o logradouro: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: ")),
			JOptionPane.showInputDialog("Digite o CEP: "),
			JOptionPane.showInputDialog("Digie o bairro: "),
			JOptionPane.showInputDialog("Digite o minucipio: "),
			JOptionPane.showInputDialog("Digite o estado: ")
		);
		
		//(String tipo, String marca, int quantidade, double valor)
		Produto objProduto = new Produto(
			JOptionPane.showInputDialog("Digite o tipo do produto: "),
			JOptionPane.showInputDialog("Digite a marca do produto: "),
			Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: ")),
			Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "))
		);
		
		objEmpresa.setEndereco(objEndereco);
		
		System.out.println(
			"Nome da empresa: " + objEmpresa.getNome() +
			"\nTipo da empresa: " + objEmpresa.getTipo() +
			"\nCNPJ: " + objEmpresa.getCnpj() +
			"\nEndereço: " + objEmpresa.getEndereco().getLogradouro() + objEmpresa.getEndereco().getNumero() + objEmpresa.getEndereco().getBairro() +
			"\nMunicipio: " + objEmpresa.getEndereco().getMunicipio() +
			"\nEstado: " + objEmpresa.getEndereco().getEstado() + 
			"\nTipo de produto: " + objProduto.getTipo() +
			"\nMarca do produto: " + objProduto.getMarca() +
			"\nQuantidade de produtos: " + objProduto.getQuantidade() +
			"\nValor do produto: " + objProduto.getValor()
				
			
		);
		
	}

}
