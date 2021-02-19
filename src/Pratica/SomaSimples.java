package Pratica;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Declare o 1 número: ");
		int a = entrada.nextInt();
		
		System.out.println("Declare o 2 número: ");
		int b = entrada.nextInt();
		
		double soma = a + b; 
		double prod = a * b;
		
		System.out.println("A soma é " + soma);
		System.out.println("O produto é " + prod);
		
		entrada.close();        
        
	}
}
