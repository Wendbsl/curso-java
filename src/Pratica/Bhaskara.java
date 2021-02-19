package Pratica;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		// soma e Produto
		
		Scanner entrada = new Scanner(System.in);
		 
	    int a, b, c;
	    double delta, x1, x2;
	    
	    System.out.println("Declare A: ");
	    a = entrada.nextInt();
	    
	    System.out.println("Declare B: ");
	    b = entrada.nextInt();
	    
	    System.out.println("Declare C: ");
	    c = entrada.nextInt();
	    
	    delta = (b * b) + (-4 * (a * c));
	    
	    x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("O resultado de x1 é: " + x1);
        System.out.println("O resultado de x2 é: " + x2);
	    
	    entrada.close();
	    
	    
	}
}
