package fr.voxilud.admin;

public class Audio {

	private int numero ;
	private String langue ;
	private int nbChapitres ;
	
	
	public Audio(int numero, String langue, int nbChapitres) {
		super();
		this.numero = numero;
		this.langue = langue;
		this.nbChapitres = nbChapitres;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getLangue() {
		return langue;
	}


	public void setLangue(String langue) {
		this.langue = langue;
	}


	public int getNbChapitres() {
		return nbChapitres;
	}


	public void setNbChapitres(int nbChapitres) {
		this.nbChapitres = nbChapitres;
	}


	@Override
	public String toString() {
		return "Audio [numero=" + numero + ", langue=" + langue + ", nbChapitres=" + nbChapitres + "]";
	}
}
