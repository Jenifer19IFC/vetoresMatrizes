package vetoresMatrizes;

import java.util.Scanner;
public class exer8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		final int TAM = 5;
		int vet[] = new int[TAM]; 
		int mult = 1;
		
		for(int i = 0; i < TAM; i++) {
			System.out.print("Número: ");
			vet[i] = input.nextInt();
			soma = soma + vet[i];
			mult = mult * vet[i];
		
		}
		for(int i = 0; i < TAM; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		System.out.println("Soma :" + soma);
		System.out.println("Multiplicação: " + mult);
		
		input.close();
	}

}

