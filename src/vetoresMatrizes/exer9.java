package vetoresMatrizes;
import java.util.Random;
import java.util.Scanner;
public class exer9 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		Random evento = new Random();
		
		int tsenha = 0;
		int i;
		char randomSen;
		String s = "";
		
		char[] v = new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
				'q','r','s','t','u','v','w','y','x','z'}; 
		
		do {
			System.out.println("Tamanho da senha:");
			tsenha=input.nextInt();
		}while (tsenha>v.length);
		
		for(i = 0; i < tsenha; i++) {
			if (i % 2 == 0) {
				do {	
					randomSen=v[evento.nextInt(26)];
				}while (randomSen == 'a' || randomSen == 'e' || randomSen == 'i' || randomSen == 'o' || randomSen == 'u');
					s = s + randomSen;
			}
			else {
				
				do {
				randomSen = v[evento.nextInt(26)];
				}
				while(randomSen != 'a' && randomSen != 'e' && randomSen != 'i' && randomSen != 'o' && randomSen != 'u');
					s = s + randomSen;
			}
		}
			
		System.out.println("Senha: " + s);
			
		input.close();
					
}
}
	


