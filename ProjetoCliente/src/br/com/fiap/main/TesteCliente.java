package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		Produto objProduto = new Produto();
		
		objCliente.setNome(JOptionPane.showInputDialog("Digitie seu nome:"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
		objCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso")));
		objCliente.setProduto(objProduto);
		
		objProduto.setTipo(JOptionPane.showInputDialog("Digite o tipo do produto"));
		objProduto.setMarca(JOptionPane.showInputDialog("Digite a marca do produto"));
		objProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de objetos")));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto")));
		
		System.out.println("Nome: " + objCliente.getNome() +
			"\nIdade: " + objCliente.getIdade() +
			"\nPeso: " + objCliente.getPeso() +
			"\nTipo do produto: " + objCliente.getProduto().getTipo() +
			"\nMarca do produto: " + objCliente.getProduto().getMarca() +
			"\nQuantidade do produto: " + objCliente.getProduto().getQuantidade() +
			"\nValor por produto: " + objCliente.getProduto().getValor() 
		);
	}
}
