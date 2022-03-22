package fr.voxilud.admin;

import java.time.LocalDate;

public class Ecoute {

	private int numero ;
	private LocalDate date ;
	private AudioBook audioBook ;
	
	public Ecoute( int numero , String date , AudioBook audioBook){
		this.numero = numero ;
		this.date = LocalDate.parse(date) ;
		this.audioBook = audioBook ;
	}
	
	public int getnumero(){
		return numero ;
	}
	
	public void setnumero( int numero ){
		this.numero = numero ;
	}
	
	public LocalDate getdate(){
		return  date ;
	}
	
	public void setdate( String date ){
		this.date = LocalDate.parse(date) ;
	}
	
	public AudioBook getaudioBook(){
		return  audioBook ;
	}
	
	public void setaudioBook( AudioBook audioBook ){
		this.audioBook = audioBook ;
	}
	
	public String toString(){
		return "Ecoute[" + numero + "," + date + "," + audioBook.getnumero()  + "]" ;
	}
}
