package vetoresMatrizes;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int v[] = new int [5];
		int i;
		for(i = 0; i < 5; i++) {
			System.out.println("Digite um número inteiro: ");
			v[i] = input.nextInt();
			
		}
		for(i = 0; i <5; i++) {
			System.out.print(v[i] + " ");
		}
		
		input.close();
	}

}