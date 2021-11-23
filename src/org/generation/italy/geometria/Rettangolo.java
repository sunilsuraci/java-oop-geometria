package org.generation.italy.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	int calcoloArea;
	int calcoloPerimetro;
	 
	Rettangolo( int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	int calcolaArea() {
		return base * altezza;
	}
	
	int calcoloPerimetro() {
		return (2*base) + (2*altezza);
	}
	String risultato () {
		String risultato = "Il perimetro del rettangolo è : " + " " + "L'area del rettangolo è : " + "";
		return risultato;
	}
}
