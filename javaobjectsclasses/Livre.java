package javaobjectsclasses;

/* Créer une classe Livre avec pour comportement d’afficher les informations le concernant.
Afficher également le code du livre construit à partir des 2ères lettres des nom et prénom de l’auteur, la 1ère
lettre de la catégorie et les 2 dernières lettres de l’ISBN.
La classe Bibliothèque devra afficher ses informations dans la console. */

public class Livre {
	
	private String author_firstname;

	private String author_lastname;
	
	private String title;
	
	private String category;
	
	private String code;
	
	private String ISBN;
	
	Livre (String author_firstname, String author_lastname, String title, String category, String ISBN){
		this.author_firstname = author_firstname;
		this.author_lastname = author_lastname;
		this.title = title;
		this.category = category;
		this.ISBN = ISBN;
		this.code = this.setCode(author_firstname, author_lastname, ISBN);
	}
	
	public String toString() {
		return "Le livre " + this.title + " appartient à la catégorie " + this.category 
				+ " et a été écris par " + this.author_firstname + " " + this.author_lastname + " et son code est " + code + "/" + ISBN + ".\n";
	}
	
	private String setCode(String author_firstname, String author_lastname, String ISBN) {
		String code = author_firstname.substring(0,2) + author_lastname.substring(0,2) +  ISBN.substring(ISBN.length() - 1,ISBN.length()); 
		return code;
	}
	
	
	public String getAuthor_firstname() {
		return author_firstname;
	}

	public void setAuthor_firstname(String author_firstname) {
		this.author_firstname = author_firstname;
	}

	public String getAuthor_lastname() {
		return author_lastname;
	}

	public void setAuthor_lastname(String author_lastname) {
		this.author_lastname = author_lastname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}


	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
}
