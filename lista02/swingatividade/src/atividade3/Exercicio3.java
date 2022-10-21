package atividade3;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 3. Faça um programa que lê precoLitro (tipo Double) e quantidadeLitros (tipo Integer)
usando o método showInputDialog da classe JOptionPane. Calcule o totalPagamento e o
exiba utilizando o método showMessageDialog da classe JOptionPane.
		 */
		
		String precolitro = JOptionPane.showInputDialog(" Informe o preco do litro");
		Double pl= Double.valueOf(precolitro);
		
		String quantidadelitros = JOptionPane.showInputDialog(" Informe o quantidade de litros");
		Integer ql = Integer.valueOf(quantidadelitros);
		
		JOptionPane.showMessageDialog(null,"total"+ pl*ql);
	}

}
