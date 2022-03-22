package fr.voxilud.admin;

import java.time.LocalDate;

public class Abonnement {

	private int numero ;
	private LocalDate dateSouscription ;
	private static int dureeAbonnement = 3 ;
	
	public Abonnement( int numero , String dateSouscription){
		this.numero = numero ;
		this.dateSouscription = LocalDate.parse(dateSouscription) ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}
	
	public LocalDate getdateSouscription(){
		return  dateSouscription ;
	}
	
	public void setdateSouscription( String dateSouscription ){
		this.dateSouscription = LocalDate.parse(dateSouscription) ;
	}
	
	public String toString(){
		return "Abonnement[" + numero + "," + dateSouscription + "]" ;
	}
	
	public static int getdureeAbonnement(){
		return Abonnement.dureeAbonnement ;
	}
	
	public static void setdureeAbonnement(int dureeAbonnement){
		Abonnement.dureeAbonnement = dureeAbonnement ;
	}
}
