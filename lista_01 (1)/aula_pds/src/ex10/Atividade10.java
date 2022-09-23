package ex10;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
	/* . Considere um programa a ser feito no console do Eclipse IDE que deve calcular a média final (MF) de
apenas um(a) discente. Considere um cálculo aritmético comum com três notas. Utilize tipos primitivos
(pense qual tipo mais adequado para notas). Ao final, o programa deve informar:
● Se MF >= 6: Aprovado(a)
● Se MF >= 4 e < 6: Recuperação
● Se MF < 4: Reprovado(a)
 */
	Scanner s = new Scanner(System.in);
		Integer nota1, nota2, nota3;
		System.out.println(" Informe a nota1 ");
		nota1 = Integer.valueOf(s.nextLine());
		
		System.out.println(" Informe a nota2 ");
		nota2 = Integer.valueOf(s.nextLine());
				
		System.out.println(" Informe a nota3 ");
		nota3 = Integer.valueOf(s.nextLine());
		
		float media = (nota1+nota2+nota3)/3;
		
		if( media>=6) {
			System.out.println(" Aprovado");
		}else if( media>= 4 && media <= 6){
			System.out.println(" Recuperção");
		}else {
			System.out.println(" Reprovado");
			
		}
	}
}
