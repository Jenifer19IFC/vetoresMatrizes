package vetoresMatrizes;

import java.util.Scanner;

public class exer16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int TAM = 5;
		int n[] = new int [TAM];
		
		for (int i = 0; i < TAM; i++) {
			do {
				System.out.println("Digite um n�mero de 0 a 20: ");
				n[i] = input.nextInt();
		
			} while ((n[i] < 0) || (n[i] > 20)); 
		}
		
		String texto = "#";
		
		System.out.println("GR�FICO:");
		for (int i = 0; i < TAM; i++) {
			System.out.println(n[i] + ": " + texto.repeat(n[i]));
		}

		input.close();

	}

}
