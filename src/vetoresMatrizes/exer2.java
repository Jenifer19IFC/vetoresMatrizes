package vetoresMatrizes;

public class exer2 {
	
	public static void main(String[] args) {
		float [] v = {(float) 1.5, (float) 3.6, (float) 5.4, (float) 7.5, (float) 3.7, 
				(float) 9.8, (float) 2.1, (float) 4.6, (float) 7.4, (float) 2.2};
			
		inverter(v);
		mostrar(v);
		
	}
	
		private static void mostrar(float[] v) {
			for(float x : v) {
				System.out.print(x + " | " );
			}
	}

		private static void inverter(float[] v) {
			float i, f;
			i = 0; f = v.length-1;
			
			while(i < f) {
				trocar(v, i, f);
				i++; 
				f--;
			}
		}


		private static void trocar(float[] v, float i, float f) {
			float aux = v[(int) i];
			v[(int) i] = v[(int) f];
			v[(int) f] = aux;
		}

}

