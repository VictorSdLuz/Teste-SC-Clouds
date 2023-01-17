//1 - Fibonnaci
//    -- Criar uma função em sua linguagem preferida. A função deve receber um numero N >= 0 (deve validar o input para a função), e retornar o valor correspondente 
//      desse número na sequencia fibonnaci. EX. fib(0) =0; fib(1) = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.
//    --- Criar uma função recursiva que resolva fibonacci
//    --- Criar uma função linear que resolva fibonnaci

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
