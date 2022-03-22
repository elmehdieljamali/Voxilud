package fr.voxilud.admin;

public class Evaluation {

	private int numero ;
	private int note ;
	private String commentaire ;
	private int nombreDeJAime = 0 ;
	private boolean validee ;

	public Evaluation( int numero , int note , String commentaire , int nombreDeJAime, boolean validee){
		this.numero = numero ;
		this.note = note ;
		this.commentaire = commentaire ;
		this.nombreDeJAime = nombreDeJAime ;
		this.validee = validee ;
	}
	
	public Evaluation( int numero , int note , String commentaire){
		this.numero = numero ;
		this.note = note ;
		this.commentaire = commentaire ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}
	
	public int getnote(){
		return note ;
	}
	
	public void setnote( int note ){
		this.note = note ;
	}
	
	public String getcommentaire(){
		return commentaire ;
	}
	
	public void setcommentaire( String commentaire ){
		this.commentaire = commentaire ;
	}
	
	public int getnombreDeJAime(){
		return nombreDeJAime ;
	}
	
	public void setnombreDeJAime( int nombreDeJAime ){
		this.nombreDeJAime = nombreDeJAime ;
	}
	
	public boolean isvalidee(){
		return validee ;
	}
	
	public void setvalide( boolean validee){
		this.validee = validee ;
	}

	public String toString(){
		return "Evaluation[" + numero + "," + note + "," + commentaire + "," + nombreDeJAime + "," + validee + "]" ;
	}
	
	public void aime(){
		nombreDeJAime = nombreDeJAime + 1 ;
	}
}
