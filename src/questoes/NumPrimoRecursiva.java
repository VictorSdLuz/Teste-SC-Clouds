package questoes;

import java.util.ArrayList;
import java.util.Scanner;

public class NumPrimoRecursiva {

	public static void main(String[] args) {
      
		int qtd;
		
		do {
			Scanner qtdScanner = new Scanner(System.in);
			System.out.println("Quantos numeros você quer checar?");
			qtd = qtdScanner.nextInt();
			if(qtd<0) {
				System.out.println("Você inseriu um número menor que 0, tente de novo");
			}
		}while(qtd<0);

		ArrayList<Integer>PrimosList = new ArrayList<Integer>();
        
        for(int i=1; i<=qtd; i++) 
        {
           if(PrimoCheck(i) == true) {
        	   PrimosList.add(i);
           }
        }
        
        System.out.print("Primos de 0 até "+qtd+": "+PrimosList.toString());
    }
     
    public static boolean PrimoCheck(int numero) {
        
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

}
