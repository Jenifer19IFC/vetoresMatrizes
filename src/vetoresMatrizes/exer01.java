package vetoresMatrizes;
import java.util.Scanner;
public class exer01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite um número ímpar entre 3 e 11(inclusos): ");
		int n = input.nextInt();
		
		if((n >= 3) && (n <= 11 ) &&(n % 2 != 0 )) {
			System.out.println("Entrada válida!");
		}else {
			System.out.println("Entrada inválida!");
		}
		
		int lin = n;
		int col = n;
	
		int mat[] [] = new int[lin][col];
		
		for(int l = 0; l < lin; l++) {
			for(int c = 0; c < col; c++) {
				 System.out.println("Digite o valor do elemento:");
				 mat[l][c] = input.nextInt();
			}
		}
		for(int l = 0; l < lin; l++) {
			for(int c = 0; c < col; c++) {
				System.out.print(mat[l][c] + " ");
			}
		}
	
		
	}

}
