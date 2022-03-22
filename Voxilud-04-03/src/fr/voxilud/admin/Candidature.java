package fr.voxilud.admin;

import java.time.LocalDate;

public class Candidature {

	private int numero ;
	private LocalDate dateDepot ;
	private LocalDate dateReponse ;
	private int etat ;
	
	public static final int EN_ATTENTE = 1 ;
	public static final int ETUDIEE = 2 ;
	public static final int ANNULEE = 3 ;
	public static final int ACCEPTEE = 4 ;
	public static final int REJETEE = 5 ;
	
	public Candidature( int numero , String dateDepot , String dateReponse , int etat){
		this.numero = numero ;
		this.dateDepot = LocalDate.parse(dateDepot) ;
		this.dateReponse = LocalDate.parse(dateReponse) ;
		this.etat = etat ;
	}
	
	public Candidature( int numero , String dateDepot , String dateReponse){
		this.numero = numero ;
		this.dateDepot = LocalDate.parse(dateDepot) ;
		this.etat = EN_ATTENTE ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}
	
	public LocalDate getdateDepot(){
		return  dateDepot ;
	}
	
	public void setdateDepot( String dateDepot ){
		this.dateDepot = LocalDate.parse(dateDepot) ;
	}
	
	public LocalDate getdateReponse(){
		return  dateReponse ;
	}
	
	public void setdateReponse( String dateReponse ){
		this.dateReponse = LocalDate.parse(dateReponse) ;
	}
	
	public int getetat(){
		return etat ;
	}
	
	public void setetat( int etat ){
		this.etat = etat ;
	}
	
	public String toString(){
		return "Candidature[" + numero + "," + dateDepot + "," + dateReponse + "," + etat + "]" ;
	}
	
	public void etudier(){
		if ( this.etat == EN_ATTENTE ) {
			this.etat = ETUDIEE ;
		}
		else {
			System.out.println("Une candidature ne peut-être étudiée que si elle est en attente.");
		}
	}
	
	public void annuler(){
		if ( this.etat == EN_ATTENTE ) {
			this.etat = ANNULEE ;
		}
		else {
			System.out.println("Une candidature ne peut-être annulée que si elle est en attente.");
		}
	}
	
	public void accepter(){
		if ( this.etat == ETUDIEE ) {
			this.etat = ACCEPTEE ;
		}
		else {
			System.out.println("Une candidature ne peut-être rejetée que si elle a été étudiée.");
		}
	}
	
	public void rejeter(){
		if ( this.etat == ETUDIEE ) {
			this.etat = REJETEE ;
		}
		else {
			System.out.println("Une candidature ne peut-être acceptée que si elle a été étudiée.");
		}
	}
}
