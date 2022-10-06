package atividade4;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Crie um programa que faça dez leituras de dados (tipo Integer) usando o método
		showInputDialog da classe JOptionPane. Você deve usar um for array. Exiba o conteúdo lido
		cada vez que uma leitura é feita utilizando o método showMessageDialog da classe
		JOptionPane.
	*/
		
		for (int i = 0; i < 10; i++) {
			String numero = JOptionPane.showInputDialog("informe o nome");
			Integer n= Integer.valueOf(numero);
			JOptionPane.showMessageDialog(null, n);

		}
	}

}
