package ex2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				//acesso a funcionalidade de leitura
				Scanner l = new Scanner(System.in);
				System.out.println("Informe o nome");
				//ler o nome e armazenou na variavel nome 
				String nome = l.nextLine();
				System.out.println("Informe a idade");

				// leu a idade (mas esta em string precisa converter) 
				String idadeString = l.nextLine();
				
				//converter a String lida em um inteiro (numero)
				Integer idade = Integer.valueOf(idadeString);
				
				//Exibir os dados lidos
				System.out.println("nome"+nome);
				System.out.println("Idade"+idade);

			}

		

	

}
