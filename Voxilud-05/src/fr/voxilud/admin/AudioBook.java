package fr.voxilud.admin;


public class AudioBook {

	private int numero ;
	private Oeuvre oeuvre ;
	private String langue ;
	
	public AudioBook( int numero , Oeuvre oeuvre , String langue){
		this.numero = numero ;
		this.oeuvre = oeuvre ;
		this.langue = langue ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}
	
	public String getlangue(){
		return  langue ;
	}
	
	public void setlangue( String langue ){
		this.langue = langue ;
	}
	
	public Oeuvre getoeuvre(){
		return  oeuvre ;
	}
	
	public void setoeuvre( Oeuvre oeuvre ){
		this.oeuvre = oeuvre ;
	}
	
	public String toString(){
		return "AudioBook[" + numero + "," + oeuvre.gettitre() + "," + langue  + "]" ;
	}
}
