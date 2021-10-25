package vetoresMatrizes;
import java.util.Scanner;
public class exer01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int soma = 0;
		int maior = 0;
		int menor = 0;
		int par = 0;
		int imp = 0;
		int dp = 0;
		int ds = 0;
		float media = 0;
		int q = 0;
		
		System.out.println("Digite um número inteiro entre 3 e 11 (inclusos): ");
		n = input.nextInt();
		
			while(true)
			if((n >= 3) && (n <= 11) && (n % 2 != 0)){
				System.out.println("Entrada válida!");
				break;
			}else {
				System.out.println("Entrada inválida!");
				System.out.println("Digite novamente um número inteiro entre 3 e 11 (inclusos): ");
				n = input.nextInt();
			}
		
		int mat [][] = new int[n][n];
		
		int l, c;
		
		for(l = 0; l < n; l++) {
			for(c = 0; c < n; c++) {
				System.out.println("Digite os valores da matriz: ");
				mat[l][c] = input.nextInt();
				q++;
			}	
		}
		for(l = 0; l < n; l++) {
			for(c = 0; c < n; c++) {
				
				soma = soma + mat[l][c];
				
				if((l == 0) && (c == 0)) {
					maior = mat[l][c];
					menor = mat[l][c];
				}else {
					if(mat[l][c] > maior)
						maior = mat[l][c];
					if(mat[l][c] < menor)
						menor = mat[l][c];
				}
				
				if(mat[l][c] % 2 == 0) 
					par++;
				else
					imp++;
				
				if(l == c)
					dp += mat[l][c];
				
				if((l + c) == n - 1)
					ds+= mat[l][c];
				
				media = soma/mat[l][c];
			}
		}
		media = soma/q;
		
		System.out.println("Soma dos elementos: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + imp);
		System.out.println("Soma da diagonal principal: " + dp);
		System.out.println("Soma da diagonal secundária: " + ds);
		
		for(l = 0; l < n; l++) {
			for(c = 0; c < n; c++) {
				System.out.print(mat[l][c] + "  ");
			}
		System.out.println();
		}
		System.out.println();
		
		input.close();
	}
		
}
	


