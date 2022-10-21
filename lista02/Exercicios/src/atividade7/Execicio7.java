package atividade7;

import javax.swing.JOptionPane;

public class Execicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * Considere um programa que deve calcular a média final (MF) de apenas um(a) discente com três
notas (tipo Double) obtidas através do método showInputDialog da classe JOptionPane. Ao
final, o programa deve informar (usando showMessageDialog da classe JOptionPane):
● Se MF >= 6: Aprovado(a)
● Se MF >= 4 e < 6: Recuperação
● Se MF < 4: Reprovado(a)
 */

	/*
	 * nadei nadei e morri na praia, tentei fazer com vetor so que só dava problema
	 */

		String n1 = JOptionPane.showInputDialog("Escreva a primeira nota:");

		String n2 = JOptionPane.showInputDialog("Escreva a segunda  nota:");

		String n3 = JOptionPane.showInputDialog("Escreva a terceira nota:");

		if (!n1.isEmpty() && !n1.isEmpty() && !n1.isEmpty()) {
			Double nota1 = Double.valueOf(n1);
			Double nota2 = Double.valueOf(n2);
			Double nota3 = Double.valueOf(n3);
			Double media = calcMedia(nota1, nota2, nota3);

			if (media >= 6) {
				JOptionPane.showMessageDialog(null, "Sua media é: " + Math.round(media) + "\nvocê foi aprovado");
			}
			if (media >= 4 && media < 6) {
				JOptionPane.showMessageDialog(null, "Sua media é: " + Math.round(media) + "\nvocê ficou Recuperasão");
			}
			if (media < 4) {
				JOptionPane.showMessageDialog(null, "Sua media é: " + Math.round(media) + "\nvocê foi Reprovado");
			}
		}
	}

	private static Double calcMedia(Double nota1, Double nota2, Double nota3) {
		return (nota1 + nota2 + nota3) / 3;
			
		}
		
	}


