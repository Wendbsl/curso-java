package Pratica;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a, b, areaRetangulo;
		
		System.out.println("Declare a: ");
		a = entrada.nextDouble();
		
		System.out.println("Declare b: ");
		b = entrada.nextDouble();
		
		areaRetangulo = a * b;
		
		System.out.println("A área desse retângulo é: " 
						+ areaRetangulo + " m2.");
		
		entrada.close();
		
		
	}
}
