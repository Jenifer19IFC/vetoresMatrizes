package vetoresMatrizes;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int v1[] = new int [10];
		int v2[] = new int [10];
		int v3[] = new int [20];
		int i = 0;
		int j = 0;
		
		for(i = 0; i < 10; i++) {
			System.out.print("VETOR 1 -- Digite um número(" + (i+1) + "):" );
			v1[i] = input.nextInt();
		}
		for(i = 0; i < 10; i++) {
			System.out.print("VETOR 2 -- Digite um número(" + (i+1) + "):" );
			v2[i] = input.nextInt();
		}
		for(i=0; i < 10; i++) {
			v3[j] = v1[i];
			j++;
			v3[j] = v2[i];
			j++;
		}
		System.out.print("VETOR 3: ");
		for(i = 0; i < 20; i++) {
			System.out.print(v3[i] + " ");
		}
		
		input.close();
		
		}

}
