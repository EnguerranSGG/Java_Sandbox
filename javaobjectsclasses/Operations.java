package javaobjectsclasses;

// Créer une classe permettant de faire des opérations mathématiques

public class Operations {
	
	private double a;
	
	private double b;
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public Operations(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double add() {
		return this.a + this.b;
	}
	
	public double soustract() {
		return this.a - this.b;
	}
	
	public double multiplicate() {
		return this.a * this.b;
	}
	
	public double divide() {
		return this.a / this.b;
	}

	public String toString() {
		return "Operations [a=" + a + ", b=" + b + "]";
	}
	
}
