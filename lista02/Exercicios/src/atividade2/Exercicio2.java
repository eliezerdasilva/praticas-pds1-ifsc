package atividade2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * 
 * 2. Faça um programa para ler o nome (tipo String) e idade (tipo Integer) de uma pessoa usando o
método showInputDialog da classe JOptionPane. Exiba conteúdo lido utilizando o método
showMessageDialog da classe JOptionPane.

 */
		
		String nome = JOptionPane.showInputDialog(" Informe o nome");
		JOptionPane.showMessageDialog(null, nome);
		
		String idade = JOptionPane.showInputDialog(" Informe a idade"); 
		Integer id = Integer.valueOf(idade);
		
		JOptionPane.showMessageDialog(null, idade);
		
		
	}

}
