package javaobjectsclasses;

public class TestEtudiant {

	public static void main(String[] args) {
		
		Etudiant Kuro = new Etudiant("Kuro", "Tsuki");
		
		Kuro.addNewNote(18.5);
		Kuro.addNewNote(17.00);
		Kuro.addNewNote(16.5);
		Kuro.addNewNote(20.00);
		Kuro.addNewNote(18.75);
		
		Kuro.setMoyenne();
		
		System.out.println(Kuro.toString());

	}
    
}
