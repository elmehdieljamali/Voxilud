package fr.voxilud.production;

public class AudioBook {

	private int numero ;
	private int nbEcoutes = 0 ;
	private Oeuvre oeuvre ;
	
	public AudioBook(int numero, int nbEcoutes, Oeuvre oeuvre) {
		super();
		this.numero = numero;
		this.nbEcoutes = nbEcoutes;
		this.oeuvre = oeuvre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNbEcoutes() {
		return nbEcoutes;
	}

	public void setNbEcoutes(int nbEcoutes) {
		this.nbEcoutes = nbEcoutes;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}
	
	public void ecouter() {
		nbEcoutes++;
	}

	@Override
	public String toString() {
		return "AudioBook [numero=" + numero + ", nbEcoutes=" + nbEcoutes + ", oeuvre=" + oeuvre + "]";
	}
}
