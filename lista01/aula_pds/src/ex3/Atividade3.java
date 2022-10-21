package ex3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner s=new Scanner(System.in);
				System.out.println("Informe um numero");
				String num=s.nextLine();
			
				Integer nume = Integer.valueOf(num);
			
				if (nume % 2 == 0) {
					System.out.println("O numero é par");
				} else {
					System.out.println("é impar");
				}
				
			

		

	}

}
