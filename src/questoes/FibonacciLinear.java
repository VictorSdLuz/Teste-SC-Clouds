package questoes;

import java.util.Scanner;

public class FibonacciLinear {

	public static void main(String[] args) {
		   
		Scanner qtdScanner = new Scanner(System.in);
		System.out.println("Quantos numeros você quer da sequência?");
		int qtd = qtdScanner.nextInt();
		
		int proxNum, primeiro=0, segundo=1;
		
	    System.out.println("Sequência de Fibonnaci até: " + qtd + " números:");

	    for (int i = 0; i <= qtd; ++i) {
	    	proxNum = primeiro + segundo;
	    	System.out.print("Fib("+i+")= "+primeiro + ", ");
	    	primeiro = segundo;
	    	segundo = proxNum;
	    }

	}

}
