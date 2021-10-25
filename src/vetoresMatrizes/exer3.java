package vetoresMatrizes;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Tamanho do vetor: ");
		int tam = input.nextInt();
		int v[] = new int[tam];
		int i;

		for (i = 0; i < tam; i++) {
			System.out.print("Números para o vetor: ");
			v[i] = input.nextInt();
		}
		float soma = 0;
		int menor = 0;
		int maior = 0;
		float media = 0;

		for (i = 0; i < tam; i++) {
			if (i == 0) {
				menor = v[i];
				maior = v[i];
			}
			else {
				if (v[i] < menor) 
					menor = v[i];
				if (v[i] > maior) 
					maior = v[i];
			}
		soma = soma + v[i];
		
		}
		media = soma / tam;

		int par = 0;
		int impar = 0;

		int mediacima = 0;
		int mediabaixo = 0;

		for (i = 0; i < tam; i++) {
			if (v[i] % 2 == 0) 
				par++;
			else if (v[i] % 2 != 0) 
				impar++;
		}

		for (i = 0; i < tam; i++) {
			if (v[i] > media) 
				mediacima = mediacima + 1;
			else 
				mediabaixo = mediabaixo + 1;
		}
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior elemento: " + maior);
		System.out.println("Menor elemento: " + menor);
		System.out.println("Pares: " + par);
		System.out.println("Ímpares: " + impar);
		System.out.println("Números acima da média : " + mediacima);
		System.out.println("Números abaixo da média : " + mediabaixo);

		input.close();
	}



	}


