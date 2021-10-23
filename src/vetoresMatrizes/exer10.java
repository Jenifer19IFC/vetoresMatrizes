package vetoresMatrizes;
import java.util.Arrays;
import java.util.Scanner;
public class exer10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Texto: ");
		String t = input.nextLine();
		
		char l[] = new char[t.length()]; 
		
		for (int i = 0; i < l.length; i++) {
			l[i] = t.charAt(i);
		}
		
		System.out.println(Arrays.toString(l));
		
		input.close();

	}

}
