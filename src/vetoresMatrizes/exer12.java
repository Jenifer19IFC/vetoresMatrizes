package vetoresMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Informe v�rias palavras: ");
		String palavras = input.next();
		String separadas[] = palavras.split(" ; ");
		
		System.out.println(Arrays.toString(separadas));
		
		input.close();

	}

}
