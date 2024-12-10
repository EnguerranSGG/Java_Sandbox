package javaobjectsclasses;

public class TestTriangle {
	
	public static void main(String[] args) {
		
		Triangle tri = new Triangle(50, 50.9, 18.8);
		
		System.out.println(tri.getCoteA());
		
		System.out.println(tri.getCoteB());
		
		System.out.println(tri.getCoteC());
		
		System.out.println(tri.calculateTriangleParameter());
		
		System.out.println(tri.calculateS());
		
		System.out.println(tri.calculateArea());
		
	}
}

