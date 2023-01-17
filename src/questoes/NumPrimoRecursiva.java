//2 - Números primos
//    -- Criar uma função em sua linguagem preferida. A função deve receber um numero N > 1 (validar o input), e retornar todos os números primos até o numero N.
//     EX. p(2) = [2]; p(3) = [2, 3]; p(10) = [2, 3, 5, 7];
//    --- Criar uma função recursiva que resolva p
//    --- Criar uma função linear que resolva p

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
