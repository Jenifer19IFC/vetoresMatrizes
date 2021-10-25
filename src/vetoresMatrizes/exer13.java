package vetoresMatrizes;

import java.util.Arrays;
import java.util.Scanner;
public class exer13 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in); 
		
		final int TAM = 3;
		int vid[] = new int [TAM];
		float valt[] = new float [TAM];
		int menorid = 99;
		int maiorid = 0; 
		int idinversa = 0;
		int	idmaisbaixo = 0;
		int idmaisalto = 0;
		float altinversa = 0;
		float maioralt = 0;
		float menoralt = 0;
		float malt = 0;
		float mid = 0;
		float somaalt = 0;
		float somaid = 0;
		float midacima = 0;
		float midabaixo = 0;
		float maltacima = 0;
		float maltabaixo = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite a idade: ");
				vid[i] = input.nextInt();
			System.out.print("Digite a altura: ");
				valt[i] = input.nextFloat();
			
			somaalt = somaalt + valt[i];
			somaid = somaid + vid[i];
		}
			
		malt = somaalt / TAM;
		mid = somaid / TAM ;
	
		System.out.println("Idade na ordem inversa: ");
		for (int j = vid.length - 1; j >= 0; j--) {
			idinversa=(vid[j]);
			System.out.print(idinversa+",");
		}
			
		System.out.println("\nAltura na ordem inversa: ");
		for (int j = valt.length - 1; j >= 0; j--) {
			altinversa=(valt[j]);
			System.out.print(altinversa+",");
		}
			
		for (int i = 0; i < TAM; i++) {
			if (i == 0) {
				maiorid = vid[i];
				float alturamaisvelho = valt[i];
				menorid=vid[i];
				float alturamaisnovo =  valt[i];	
			} 
			else {
				if (vid[i] < menorid) {
					menorid = vid[i];
					float alturamaisnovo = valt[i];
				}
				if (vid[i] > maiorid) {
					maiorid = vid[i];
					float alturamaisnovo = valt[i];
				}      
				
			}	
		}
		
		System.out.println("\nMais novo: " + menorid);
    	System.out.println("Mais velho: " + maiorid);

			
        for ( int i = 0; i < TAM; i++) {
        	if (i == 0) {
				maioralt = valt[i];
				idmaisalto = vid[i];
				menoralt = valt[i];
				idmaisbaixo = vid[i];
			} 
			else {        	
        		if (valt[i] < menoralt) {
					menoralt = valt[i];
					idmaisbaixo = vid[i];
				}
				if (valt[i] > maioralt) {
					maioralt = valt[i];
					idmaisalto = vid[i];
				}
			}
        }
        System.out.println("Mais baixo (a) com " + menoralt + " m" + " e idade: " + idmaisbaixo);
    	System.out.println("Mais alto (a) com " + maioralt + " m" + " e idade: " + idmaisalto);
    	
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				midabaixo=vid[i];
				midacima=vid[i];
			} 
			else if (vid[i] < mid) {
				midabaixo = vid[i];
            }
            else {
            	midacima = vid[i];
            }
		}
		
		for (int i = 0; i < TAM; i++) {
			if (i==0) {
				maltabaixo=valt[i];
				maltacima=valt[i];
			} 
			else if (valt[i] < malt) {
            	maltabaixo = valt[i];
            }
            else {
            	maltacima = valt[i];
            }
		}
            System.out.println("Altura acimda da média: " + maltacima);
        	System.out.println("Abaixo da média de altura: " + maltabaixo);
        	System.out.println("Acima da média de idade: " + midacima);
        	System.out.println("Abaixo da média de idade: " + midabaixo);		

        input.close();

	}

}
