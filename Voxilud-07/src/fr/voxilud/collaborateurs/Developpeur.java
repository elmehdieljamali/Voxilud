package fr.voxilud.collaborateurs;

public class Developpeur extends Collaborateur {

	private int soldeRtt ;
	private int competence ;
	
	public Developpeur(int matricule, String nom, String prenom, int soldeRtt, int competence) {
		super(matricule, nom, prenom);
		this.soldeRtt = soldeRtt;
		this.competence = competence;
	}

	public int getSoldeRtt() {
		return soldeRtt;
	}

	public void setSoldeRtt(int soldeRtt) {
		this.soldeRtt = soldeRtt;
	}

	public int getCompetence() {
		return competence;
	}

	public void setCompetence(int competence) {
		this.competence = competence;
	}

	@Override
	public String toString() {
		return "Developpeur [" + super.toString() + "soldeRtt=" + soldeRtt + ", competence=" + competence + "]";
	}
	
	public void
}
