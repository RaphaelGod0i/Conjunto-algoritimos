package desafios.estagio;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonnaci {
	

	    public static void main(String[] args) {
	        
	        // solicita ao usuário o número até o qual a sequência de Fibonacci será calculada
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Informe o número limite da sequência de Fibonacci: ");
	        int limite = scanner.nextInt();
	        
	        // inicializa os dois primeiros valores da sequência
	        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
	        fibonacci.add(0);
	        fibonacci.add(1);
	        
	        // calcula a sequência de Fibonacci até o número informado pelo usuário
	        while (fibonacci.get(fibonacci.size()-1) < limite) {
	            int novo_valor = fibonacci.get(fibonacci.size()-1) + fibonacci.get(fibonacci.size()-2);
	            fibonacci.add(novo_valor);
	        }
	        
	        // verifica se o número informado pertence à sequência
	        if (fibonacci.contains(limite)) {
	            System.out.println("O número " + limite + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println("O número " + limite + " não pertence à sequência de Fibonacci.");
	        }
	        
	        scanner.close();
	    }
	}

