package questoes;

import java.util.Scanner;

public class FibonnaciRecursiva {

	public static void main(String[] args) {
		
		int qtd;
		do {
			Scanner qtdScanner = new Scanner(System.in);
			System.out.println("Quantos numeros você quer da sequência?");
			qtd = qtdScanner.nextInt();
			if(qtd<0) {
				System.out.println("Você inseriu um número menor que 0, tente de novo");
			}
		}while(qtd<0);
			
		System.out.println("Sequência de Fibonnaci até: " + qtd + " números:");

		for (int i = 0; i <= qtd; ++i) {
			int NumFibonacci = fibonacci(i);
			System.out.print("Fib("+i+")= "+NumFibonacci + ", ");		    	
		}
	}
	
	
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		} else if(n==1) {
			return 1;
		}else {
			return fibonacci(n-1)+ fibonacci(n-2);
		}

	}

}
