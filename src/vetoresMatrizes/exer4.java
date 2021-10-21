package vetoresMatrizes;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float n [] = new float[4];
		float soma = 0;
		float media;
	
		for(int i = 0; i < 4; i++ ) {
			System.out.println("Digite a nota: ");
			n[i] = input.nextFloat();
			soma = soma + n[i];
		}
		media = soma/4;
		System.out.print("Notas: ");
		for(int i = 0; i < 4; i++ ) {
			System.out.print(n[i] + "   ");
		}
		System.out.println();
		System.out.println("Média: " + media);
		
		input.close();
	}

}