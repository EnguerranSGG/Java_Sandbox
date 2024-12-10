package javaobjectsclasses;

/* Créer une classe Triangle avec différentes données et dont le comportement permet entre autres :
◼ De calculer le périmètre
◼ De calculer l’aire */

public class Triangle {
	
	private double coteA;
	
	private double coteB;
	
	private double coteC;

	public double getCoteA() {
		return coteA;
	}

	public void setCoteA(int coteA) {
		this.coteA = coteA;
	}

	public double getCoteB() {
		return coteB;
	}

	public void setCoteB(int coteB) {
		this.coteB = coteB;
	}

	
	public double getCoteC() {
		return coteC;
	}

	public void setCoteC(int coteC) {
		this.coteC = coteC;
	}

	public Triangle(double coteA, double coteB, double coteC) {
	    
	    if (coteA <= 0 || coteB <= 0 || coteC <= 0) {
	        throw new IllegalArgumentException("Les côtés d'un triangle doivent être strictement positifs.");
	    }
	    
	    if (coteA + coteB <= coteC || coteA + coteC <= coteB || coteB + coteC <= coteA) {
	        throw new IllegalArgumentException("Les longueurs des côtés ne respectent pas la condition d'existence d'un triangle.");
	    }
	    
	    this.coteA = coteA;
	    this.coteB = coteB;
	    this.coteC = coteC;
	}
	
	

	
	public double calculateTriangleParameter() {
		return this.coteA + this.coteB + this.coteC;
	}
	
	public double calculateS() {
		return calculateTriangleParameter() / 2;
	}
	
	public double calculateArea() {
		double s = calculateS();
		
		return Math.sqrt(s * (s - this.coteA) * (s - this.coteB) * (s - this.coteC));
	}
	
}