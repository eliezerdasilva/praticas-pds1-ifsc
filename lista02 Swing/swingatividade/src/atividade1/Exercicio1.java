package atividade1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Faça um programa que leia um nome (tipo String) usando o método showInputDialog da
classe JOptionPane. Exiba o nome utilizando o método showMessageDialog da classe
JOptionPane.
 */
		
		String nome = JOptionPane.showInputDialog(" entre com o nome");
	    JOptionPane.showMessageDialog(null, nome);
	}

}
