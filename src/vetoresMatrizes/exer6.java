package vetoresMatrizes;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int c;
		int qp = 0;
		int qi = 0;
		final int TAM = 20;
		
		int[] n = new int [TAM];

		for( c = 0; c < TAM; c++) {
			System.out.println("Digite um número: ");
		    n[c] = input.nextInt();
		}  
		
		System.out.print("Vetor: ");
		for(c = 0; c < TAM; c++) {
		  if (n[c] % 2 == 0) {
			  qp ++;
			  
		  }else if(n[c] % 2 != 0) {
			  qi++;
		  }
		  System.out.print( n[c] + " ");
		  
		}
		
		int[] pares = new int [qp];
		int[] impares = new int [qi];
		
		int pp = 0;
		int pi = 0;
		
		for(c = 0; c < TAM; c++) {
			if (n[c] % 2 == 0) {
				pares[pp] = n[c];
				 pp++;
			 }else if(n[c] % 2 != 0) { 
				 impares[pi] = n[c];
				 pi++;
			}
		}
		System.out.println();
		System.out.print("Pares: ");
		for(int i: pares) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Ímpares: ");
		for(int i: impares) {
			System.out.print(i + " ");
		}
		
		input.close();
	}
	 
}