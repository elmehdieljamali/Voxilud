package fr.voxilud.admin;

public class Oeuvre {

	private int numero ;
	private String titre ;
	private static int nbOeuvres = 0 ;
	
	public Oeuvre( int numero , String titre){
		this.numero = numero ;
		this.titre = titre ;
		nbOeuvres += 1 ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}
	
	public String gettitre(){
		return titre ;
	}
	
	public void settitre( String titre ){
		this.titre = titre ;
	}
	
	public String toString(){
		return "Oeuvre[" + numero + "," + titre + "]" ;
	}
	
	public static int getnbOeuvres(){
		return nbOeuvres ;
	}
}
