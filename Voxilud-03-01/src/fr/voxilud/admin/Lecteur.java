package fr.voxilud.admin;

public class Lecteur {

	private int numero = 0 ;
	private String nom = "mon nom est personne" ;
	private String prenom = "mon prénom est personne" ;
	private int nombreAudiosProduits = 0 ;
	
	public Lecteur( int numero , String nom , String prenom , int nombreAudiosProduits){
		this.numero = numero ;
		this.nom = nom ;
		this.prenom = prenom ;
		this.nombreAudiosProduits = nombreAudiosProduits ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}
	
	public String getnom(){
		return "Nom du lecteur numéro " + numero + " : " + nom ;
	}
	
	public void setnom( String nom ){
		this.nom = nom ;
	}
	
	public String getprenom(){
		return prenom ;
	}
	
	public void setprenom( String prenom ){
		this.prenom = prenom ;
	}
	
	public int getnombreAudiosProduits(){
		return nombreAudiosProduits ;
	}
	
	public void setnombreAudiosProduits( int nombreAudiosProduits ){
		this.nombreAudiosProduits = nombreAudiosProduits ;
	}
	
	public boolean estActif(){
		if( nombreAudiosProduits >= 10 ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public void produireUnAudio(){
		nombreAudiosProduits = nombreAudiosProduits + 1 ;
	}
	
	public String toString(){
		return "Lecteur[" + numero + "," + nom + "," + prenom + "," + nombreAudiosProduits + "]" ;
	}
}
