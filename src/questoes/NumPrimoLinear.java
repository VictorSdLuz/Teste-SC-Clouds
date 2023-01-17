package questoes;

import java.util.ArrayList;
import java.util.Scanner;

public class NumPrimoLinear {

	public static void main(String[] args) {
		int qtd, contador;
		
		do {
			Scanner qtdScanner = new Scanner(System.in);
			System.out.println("Quantos numeros você quer checar?");
			qtd = qtdScanner.nextInt();
			if(qtd<0) {
				System.out.println("Você inseriu um número menor que 0, tente de novo");
			}
		}while(qtd<0);

		ArrayList<Integer>PrimosList = new ArrayList<Integer>();
        
		for(int j=2; j<qtd; j++) {
			contador=0;
			for(int i=1; i<=j;i++) {
				if(j%i==0) {
					contador++;
				}
			}
			if (contador==2) {
				PrimosList.add(j);
			}
		}
		 System.out.print("Primos de 1 até "+qtd+": "+PrimosList.toString());
    }

}


