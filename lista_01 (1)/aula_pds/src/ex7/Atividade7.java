package ex7;

public class Atividade7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String[] vet = new String[10];
		
		/*Crie um vetor de String de tamanho 10 (dez) com valores pré-definidos. Você não deve usar Scanner. Em
seguida, exiba no console os dados do vetor (um a um) e o tamanho dele. Além disso, exiba apenas o último
elemento acessando-o diretamente.
*/
		vet[0] = "1";
		vet[1] = "2";
		vet[2] = "3";
		vet[3] = "4";
		vet[4] = "5";
		vet[5] = "6";
		vet[6] = "7";
		vet[7] = "8";
		vet[8] = "9";
		vet[9] = "10";
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("O valor aramzenado no vetor na posicao " + i + "eh: " + vet[i]);
		}
		
		System.out.println("O ultimo valor do vetor eh: " + vet[vet.length - 1]);
	}


	

}
