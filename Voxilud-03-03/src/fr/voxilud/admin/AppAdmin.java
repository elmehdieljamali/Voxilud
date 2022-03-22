package fr.voxilud.admin;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Audio [] lesAudios = {
				
				new Audio( 1 , "Français" , 15 ) ,
				new Audio( 2 , "Anglais" , 20 ) ,
				new Audio( 3 , "Français" , 10 ) ,
				new Audio( 4 , "Français" , 8 ) ,
				new Audio( 5 , "Allemand" , 33 ) ,
				new Audio( 6 , "Allemand" , 10 ) ,
				new Audio( 7 , "Anglais" , 15 ) ,
				new Audio( 8 , "Français" , 20 )
				
		} ;
		
		
		System.out.println( "\n\n----[ Question 4.3.4 ]----\n" ) ;
		visualiserAudios( lesAudios ) ;
		
		
		System.out.println( "\n\n----[ Question 4.3.5 ]----\n" ) ;
		visualiserLangueAudios( lesAudios ) ;
		
		
		System.out.println( "\n\n----[ Question 4.3.6 ]----\n" ) ;
		visualiserLangueAudiosMaj( lesAudios ) ;
		
		
		System.out.println( "\n\n----[ Question 4.3.7 ]----\n" ) ;
		int nbAudiosEnFr = calculerNbAudiosEnFrancais( lesAudios ) ;
		System.out.println( "Nombre d'audios en français : " + nbAudiosEnFr ) ;
		
		
		System.out.println( "\n\n----[ Question 4.3.8 ]----\n" ) ;
		visualiserNbMaxChapitres( lesAudios ) ;
		
	}
	
	
	private static void visualiserAudios( Audio [] lesAudios ) {
		// Question 4.3.4 : Votre code ici
		for(int i = 0 ; i < lesAudios.length ; i++){
			System.out.println(lesAudios[i]);
		}
		
	}
	
	
	private static void visualiserLangueAudios( Audio [] lesAudios ) {
		// Question 4.3.5 : Votre code ici
		for(Audio unAudio : lesAudios){
			System.out.println("Langue audio " + unAudio.getNumero() + " : " + unAudio.getLangue());
		}
		
	}
	

	private static void visualiserLangueAudiosMaj( Audio [] lesAudios ) {
		// Question 4.3.6 : Votre code ici
		for(Audio unAudio : lesAudios){
			System.out.println("Langue audio " + unAudio.getNumero() + " : " + unAudio.getLangue().toUpperCase());
		}		
	}
	
	
	private static int calculerNbAudiosEnFrancais( Audio [] lesAudios ) {
		int nbAudiosFr = 0 ;
		
		// Question 4.3.7 : Votre code ici
		for(Audio unAudio : lesAudios){
			if(unAudio.getLangue() == "Français"){
					nbAudiosFr++ ;
			}
		}
		
		return nbAudiosFr ;
	}
	
	
	private static void visualiserNbMaxChapitres( Audio [] lesAudios ) {
		// Question 4.3.8 : Votre code ici
		if (lesAudios.length > 0){
			int nbMaxChapitres = 0 ;
			
			for(int i = 0 ; i < lesAudios.length ; i++){
				if(lesAudios[i].getNbChapitres() > nbMaxChapitres){
					nbMaxChapitres = lesAudios[i].getNbChapitres() ;
				}
			}
			System.out.println(nbMaxChapitres);
		}
		else{
			System.out.println("Aucun audio recensé.");
		}
		
	}
		
	}

