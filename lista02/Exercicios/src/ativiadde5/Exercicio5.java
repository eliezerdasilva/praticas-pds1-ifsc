package ativiadde5;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*5. Crie um vetor de tipo Integer e tamanho 10 (dez). Preencha este vetor usando o método
showInputDialog da classe JOptionPane em um for array. Mostre o maior número e o menor
número ao final utilizando o método showMessageDialog da classe JOptionPane. Não é
necessário exibir todo o conteúdo do vetor, apenas o maior e menor número.
*/
		 
	

				Integer numero[] = new Integer[10];
				Integer max = Integer.MIN_VALUE;
				Integer min = Integer.MAX_VALUE;

				for (int i = 0; i < 10; i++) {

					String n = JOptionPane.showInputDialog("Escreva um numero:");

					if (!n.isEmpty()) {
						Integer num = Integer.valueOf(n);
						numero[i] = num;

						if (numero[i] > max) {
							max = num;
						}
						if (numero[i] < min) {
							min = num;
						}
					} else {
						i = i - 1;
						JOptionPane.showMessageDialog(null, "valor invalido");
					}
				}
				JOptionPane.showMessageDialog(null, "o maior numero é: " + max);
				JOptionPane.showMessageDialog(null, "o menor numero é: " + min);

			


	}

	private static int numero(String showInputDialog) {
		// TODO Auto-generated method stub
		return 0;
	}

}
