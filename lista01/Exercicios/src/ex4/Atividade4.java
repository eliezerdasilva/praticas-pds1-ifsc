package ex4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		 * . Crie um programa simples em Java que faça dez leituras de dados (tipo inteiro) usando Scanner e
usando um for array. Exiba no console o conteúdo lido cada vez que uma leitura é feita. Não utilize vetor.

		 */
				Scanner s =new Scanner(System.in);
				for (int i = 0; i < 10; i++) {
					System.out.println("Informe 10 numeros");
					String num = s.nextLine();
					Integer nume= Integer.valueOf(num);
					System.out.println(nume);
				}
			}

		

	

}
