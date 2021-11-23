package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserici la base : ");
		int base = scanner.nextInt();
		System.out.println("inserisci l'altezza : ");
		int altezza = scanner.nextInt();
		
		Rettangolo mioRettangolo = new Rettangolo(base , altezza);
		System.out.println(risultato);
		
		
		scanner.close();
	}

}
