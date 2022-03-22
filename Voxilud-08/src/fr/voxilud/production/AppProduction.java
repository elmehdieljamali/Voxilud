package fr.voxilud.production;

public class AppProduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lecteur lec1 = new Lecteur(1, "DOS SANTOS", "Antoine") ;
		//System.out.println(lec1.getAudios());
		
		lec1.ajouterAudio(new AudioBook(21, 2300, new Oeuvre(15, "Le sport des rois")) );
		lec1.ajouterAudio(new AudioBook(37, 4501, new Oeuvre(28, "Nino dans la nuit")) );
		lec1.ajouterAudio(new AudioBook(45, 3020, new Oeuvre(58, "L'empreinte")) );
		
		//System.out.println(lec1.getAudios());
		for (AudioBook aud:lec1.getAudios()){
			System.out.println(aud.getOeuvre().getTitre());
		}
		
		//System.out.println(lec1.rechercherAudio(37));
		//System.out.println(lec1.rechercherAudio(201));
		
		lec1.supprimerAudio(231);
		//System.out.println(lec1.getAudios());
		
		lec1.supprimerAudio(37);
		//System.out.println(lec1.getAudios());
		
		lec1.ajouterAudio(new AudioBook(21, 2033, null));
		lec1.supprimerAudio(21);
		System.out.println(lec1.getAudios());
	}
}
