package vetoresMatrizes;

import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		char v[] = {'d', 'e', 'f','g', 'e', 'i', 'j', 'k', 'l','o'};
		int cont = 0;
		int j;
		
		System.out.print("Consoantes: ");
		for(j = 0; j < 10; j++) {
			if((v[j] != 'a') && (v[j] != 'e') && (v[j] != 'i') && (v[j] != 'o') && (v[j] != 'u'))  {
					cont++; 
					System.out.print( v[j] + " ");
			}	
		}
		System.out.println();
		System.out.println("Quantidade de consoantes: " + cont);
		
	}

}
