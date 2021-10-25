package vetoresMatrizes;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		final int TAM = 30;
		int id[] = new int [TAM];
		float alt[] = new float [TAM];
		float s = 0; 
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Idade: ");
			id [i]= input.nextInt();
			System.out.print("Altura: ");
			alt [i] = input.nextFloat();
			s = s + alt[i];
		}
		
		float mediaalt = (s/TAM);
		int qtdalunos = 0;
		 
		for (int i = 0; i < TAM; i++) {
			if ((id[i] > 13) && (alt[i] < mediaalt)) {
				qtdalunos = qtdalunos + 1;
			}
		}
		
		System.out.println("Quantidade de alunos com mais de 13 anos e altura inferior à média: " + qtdalunos);
		
		input.close();
	}

}

