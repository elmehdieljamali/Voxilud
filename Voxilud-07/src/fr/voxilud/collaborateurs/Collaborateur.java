package fr.voxilud.collaborateurs;

public class Collaborateur {
	
	private int matricule ;
	private String nom ;
	private String prenom ;
	
	public Collaborateur(int matricule, String nom, String prenom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getMatricule() {
		return matricule;
	}
	
	public void setMatricule(int matricule) {
		this.matricule = matricule;
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

	@Override
	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	public void toHTML() {
		System.out.println("<div id=\'" + matricule + "\' class=\'collaborateur\'>\n" + prenom + "<strong>" + nom + "</strong>\n</div>");
	}
}
