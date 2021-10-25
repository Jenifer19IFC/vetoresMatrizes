package vetoresMatrizes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite uma data: ");
			String data = input.next();
			String datacomp[] = data.split("/");

	    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	        
	    sdf.setLenient(false);
	    try {
			sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    System.out.println(Arrays.toString(datacomp));
	    
		input.close();
		}
	{

	}

}
