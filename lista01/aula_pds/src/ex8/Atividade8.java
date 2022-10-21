package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor da lista");
			lista.add(x.nextLine());
		}
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		System.out.println("Tamanho da lista: " + lista.size());
		
		System.out.println("O ultimo elemento da lista: " + lista.get(lista.size() - 1));
	}

}
