package fr.voxilud.admin;

public class Auditeur extends Membre {

	private String languePref ;
	private int nbOeuvres ;
	
	public Auditeur(int numero, String nom, String email, String languePref, int nbOeuvres) {
		super(numero, nom, email);
		this.languePref = languePref;
		this.nbOeuvres = nbOeuvres;
	}

	public String getLanguePref() {
		return languePref;
	}

	public void setLanguePref(String languePref) {
		this.languePref = languePref;
	}

	public int getNbOeuvres() {
		return nbOeuvres;
	}

	public void setNbOeuvres(int nbOeuvres) {
		this.nbOeuvres = nbOeuvres;
	}
	
	public void toHtml() { 
		System.out.println("<span id=\'" + super.getNumero() + "\' class=\'auditeur\'>\n" + super.getNom() + "(<em>" + languePref + "</em>)\n"+ "</span>" );
	}

	@Override
	public String toString() {
		return "Auditeur [" + super.toString() + " languePref = " + languePref + ", nbOeuvres = " + nbOeuvres + "]";
	}
	
	
}
