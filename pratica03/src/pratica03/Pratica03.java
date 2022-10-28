package pratica03;

import java.util.Scanner;

import javax.swing.JOptionPane;

/***
 * 
 * @author eliezer
 * @version 1.0.
 *
 */
public class Pratica03   {

	public static void main(String[] args) {
			
			Integer[] vetor = new Integer[3];
			for(int i = 0;         i < vetor.length; i++) {
				String numS = JOptionPane.showInputDialog("Informe");

				Integer num = Integer.valueOf(numS);
				vetor[i] = num;
			
			}
			
			JOptionPane.showMessageDialog(null, somaVetor(vetor));
		}
		
		static int somaVetor(Integer[] vetor) {
			Integer soma = 0;
			for ( int i = 0; i < vetor.length; i++) {
				soma = soma + vetor[i];
			}
			return soma;
		}

}