package fr.voxilud.admin;

public class Auteur {

	private int numero ;
	private String nom ;
	private String prenom ;

	public Auteur( int numero , String nom, String prenom){
		this.numero = numero ;
		this.nom = nom ;
		this.prenom = prenom ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}

	public String getnom(){
		return  nom ;
	}
	
	public void setnom( String nom ){
		this.nom = nom ;
	}
	
	public String getprenom(){
		return  prenom ;
	}
	
	public void setprenom( String prenom ){
		this.prenom = prenom ;
	}
	
	public String toString(){
		return "Auteur[" + numero + "," + nom + "," + prenom + "]" ;
	}
}
