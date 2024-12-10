package javaobjectsclasses;

import java.util.ArrayList;

/* Créer une classe Etudiant contenant différentes informations en dur (dont plusieurs notes)
Permettre à l’étudiant de calculer la moyenne des notes
Permettre à l’étudiant d’afficher ses initiales
Permettre à l’étudiant d’afficher son trigramme (1ère lettre du prénom, 1ère lettre du nom, dernière lettre du
nom) */

public class Etudiant {
	
	private ArrayList<Double> notes = new ArrayList<Double>();
	
	private String nom;
	
	private String prenom;
	
	private double moyenne;

	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void addNewNote(double note) {
		this.notes.add(note);
	}
	
	public double setMoyenne() {
		
		double totalPoints = 0;
		int divider = 0;
		
		for(double note : this.notes) {
			totalPoints += note;
			divider++;
		}
		
		return moyenne = totalPoints / divider;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return "Etudiant [notes=" + notes + ", nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + "].\n"
				+ "Ses initiales sont " + prenom.charAt(0) + nom.charAt(0) + ".";
	}
	
}
