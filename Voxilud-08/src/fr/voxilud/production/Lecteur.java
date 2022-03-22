package fr.voxilud.production;

import java.util.List;
import java.util.ArrayList;

public class Lecteur {

	private int numero ;
	private String nom ;
	private String prenom ;
	private List<AudioBook> audios = new ArrayList<AudioBook>() ;
	
	public Lecteur(int numero, String nom, String prenom) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	
	public List<AudioBook> getAudios() {
		return this.audios ;
	}

	public void ajouterAudio(AudioBook AudioBook) {
		this.audios.add(AudioBook) ;
	}
	
	public boolean supprimerAudio(AudioBook AudioBook) {
		try {
			for (AudioBook aud:this.audios){
				if (aud == AudioBook) {
					audios.remove(audios.indexOf(aud)) ;
				}
			}
			return true ;
		}
		catch(Exception e) {
			return false ;
		}		
	}
	
	public boolean supprimerAudio(int numero) {
		try {
			for (AudioBook aud:this.audios){
				if (aud.getNumero() == numero) {
					audios.remove(audios.indexOf(aud)) ;
				}
			}
			return true ;
		}
		catch(Exception e) {
			return false ;
		}		
	}
	
	public AudioBook rechercherAudio(int numero) {
		AudioBook audio = null ; 
		for (AudioBook aud:this.audios){
				if (aud.getNumero() == numero) {
					audio = aud ;
				}
			}
		return audio ;
		}
	
	@Override
	public String toString() {
		return "Lecteur [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}
