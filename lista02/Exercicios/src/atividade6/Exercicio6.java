package atividade6;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie uma lista (ArrayList) de String. Preencha 10 (dez) elementos nesta lista fazendo a leitura
com o método showInputDialog da classe JOptionPane em um for array. Em seguida, exiba
todos os dados de uma só vez utilizando o método showMessageDialog da classe
JOptionPane
		 */
		ArrayList<String> lista = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			lista.add(JOptionPane.showInputDialog("Informe um numero: "));
		}

		for (String string : lista) {
			JOptionPane.showMessageDialog(null, lista);	
			
		}
		
	}

}
