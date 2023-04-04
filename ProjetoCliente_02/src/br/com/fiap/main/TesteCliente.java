package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Produto objProduto = new Produto(
				JOptionPane.showInputDialog("Digite o tipo do produto: "),
				JOptionPane.showInputDialog("Digite a marca do produto: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produto: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "))
		);
		
		Cliente objCliente = new Cliente(
				JOptionPane.showInputDialog("Digite o seu nome: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura")),
				objProduto);		
		
		System.out.println("Nome: " +  objCliente.getNome() +
		"\nIdade: " + objCliente.getIdade() +
		"\nPeso: " + objCliente.getPeso() +
		"\nAltura: " + objCliente.getAltura() +
		"\nTipo de produto: " + objCliente.getProduto().getTipo() +
		"\nMarca do produto: " + objCliente.getProduto().getMarca() +
		"\nQuantidade do produto: " + objCliente.getProduto().getQuantidade() +
		"\nValor dos produtos: " + objCliente.getProduto().getValor()
		);
		
	}
}
