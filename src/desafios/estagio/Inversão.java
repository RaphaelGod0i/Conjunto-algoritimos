package desafios.estagio;
import java.util.Scanner;

public class Inversão {
	


	    public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Informe uma palavra: ");
	        String original = input.nextLine();
	        
	        // converte a string em um array de caracteres
	        char[] array = original.toCharArray();
	        
	        // inverte o array de caracteres
	        for (int i = 0; i < array.length / 2; i++) {
	            char temp = array[i];
	            array[i] = array[array.length - i - 1];
	            array[array.length - i - 1] = temp;
	        }
	        
	        // converte o array de caracteres de volta para uma string
	        String invertida = new String(array);
	        
	        System.out.println("A palavra " + original + "invertida seria assim: " + invertida);
	        
	        input.close();
	    }

	}
