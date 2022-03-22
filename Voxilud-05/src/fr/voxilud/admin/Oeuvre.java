package fr.voxilud.admin;

public class Oeuvre {

	private int numero ;
	private String titre ;
	private Auteur auteur ;
	private static int nbOeuvresInconnus ;
	
	public Oeuvre( int numero , String titre , Auteur auteur){
		this.numero = numero ;
		this.titre = titre ;
		this.auteur = auteur ;
	}
	
	public Oeuvre( int numero , String titre){
		this.numero = numero ;
		this.titre = titre ;
		nbOeuvresInconnus++ ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}

	public String gettitre(){
		return  titre ;
	}
	
	public void settitre( String titre ){
		this.titre = titre ;
	}
	
	public Auteur getauteur(){
		return  auteur ;
	}
	
	public void setauteur( Auteur auteur ){
		this.auteur = auteur ;
	}
	
	public static int getnbOeuvresInconnus(){
		return nbOeuvresInconnus ;
	}
	
	public String toString(){
		return "Oeuvre[" + numero + "," + titre + "," + auteur.getnom() + "," + auteur.getprenom() + "]" ;
	}
}
