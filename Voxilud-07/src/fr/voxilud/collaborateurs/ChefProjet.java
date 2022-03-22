package fr.voxilud.collaborateurs;

public class ChefProjet extends Collaborateur {

	private int experience ;
	private int nbProjets ;
	
	public ChefProjet(int matricule, String nom, String prenom, int experience, int nbProjets) {
		super(matricule, nom, prenom);
		this.experience = experience;
		this.nbProjets = nbProjets;
	}

	public int getexperience() {
		return experience;
	}

	public void setexperience(int experience) {
		this.experience = experience;
	}

	public int getNbProjets() {
		return nbProjets;
	}

	public void setNbProjets(int nbProjets) {
		this.nbProjets = nbProjets;
	}

	@Override
	public String toString() {
		return "ChefProjet [" + super.toString() + "experience=" + experience + ", nbProjets=" + nbProjets + "]";
	}
	
	public void toHTML() {
		System.out.println("<div id=\'" + super.getMatricule() + "\' class=\'chefProjet\'>\n" + super.getPrenom() + "<strong>" + super.getNom() + "</strong>\nNiveau de compétence :" + competence + "\n RTT : " + </div>");
	}
}
