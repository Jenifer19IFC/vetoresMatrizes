package vetoresMatrizes;
import java.util.Scanner;
public class exer7 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		final int TAMA = 10;
		final int TAMN = 4;
		int j = 0;
		int i = 0;
		int a = 0;
		float media = 0;
		float soma = 0;
		
		for(i = 0; i < TAMA; i++) {
			System.out.println("Digite as notas: ");
			
			float n[] = new float[TAMN];
			
			for(j = 0; j < TAMN; j++) {
				System.out.println("Nota " + (j+1) + ":");
				n[j] = input.nextFloat();
				soma = soma + n[j];
			}
			media = soma / TAMN;
			soma = 0;
			System.out.println("Média: " + media);
			
			if(media > 7) {
				a++;
			}
		}
		System.out.println(a + "  aluno(s) com média acima de 7");
		
		input.close();
		
	}
}