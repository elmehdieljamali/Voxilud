package fr.voxilud.admin;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auteur aut115 = new Auteur (115, "SAND", "Georges") ;
		System.out.println(aut115);
		System.out.println(aut115.getnom());
		
		Oeuvre oeuv35 = new Oeuvre (35, "Indiana" , aut115) ;
		System.out.println(oeuv35);
		System.out.println(oeuv35.gettitre());
		System.out.println(oeuv35.getauteur());
		System.out.println(oeuv35.getauteur().getnom());
		
		AudioBook audio235 = new AudioBook (235, oeuv35, "Français") ;
		System.out.println(audio235);
		System.out.println(audio235.getoeuvre());
		System.out.println(audio235.getoeuvre().gettitre());
		System.out.println(audio235.getoeuvre().getauteur());
		System.out.println(audio235.getoeuvre().getauteur().getnom());
		
		
		Auteur aut111 = new Auteur (111, "MAUPASSANT", "Guy") ;
		Auteur aut112 = new Auteur (112, "DUMAS", "Alexandre") ;
		Auteur aut113 = new Auteur (113, "CAMUS", "Albert") ;
		Auteur aut114 = new Auteur (114, "BARJAVEL", "René") ;
		
		Auteur [] auteurs = { aut111, aut112, aut113, aut114 }  ;
		for( int i = 0 ; i < auteurs.length ; i++){
			System.out.println(auteurs[i].getnom());
		}
		System.out.println(auteurs[2].getnom());
		
		
		Oeuvre oeuv28 = new Oeuvre (28, "La Reine Margot", aut112) ;
		Oeuvre oeuv31 = new Oeuvre (31, "Bel ami", aut111) ;
		Oeuvre oeuv32 = new Oeuvre (32, "Chanson") ;
		Oeuvre oeuv33 = new Oeuvre (33, "Pauline", aut112) ;
		
		Oeuvre [] oeuvres = { oeuv28, oeuv31, oeuv32, oeuv33 } ;
		System.out.println(Oeuvre.getnbOeuvresInconnus());
		
		for( int i = 0 ; i < oeuvres.length ; i++){
			try{
			System.out.println(oeuvres[i].gettitre() + " " + oeuvres[i].getauteur().getnom()); 
			}
			catch( Exception e ){
				System.out.println(oeuvres[i].gettitre());
			}
		}
		
		
		for( int i = 0 ; i < oeuvres.length ; i++){
			if(oeuvres[i].getauteur().getnom() == "DUMAS" ){
				nbOeuvresDUMAS++ ;
			}
		}
		
		
		AudioBook audio223 = new AudioBook (223, oeuv32, "Français") ;
		AudioBook audio224 = new AudioBook (224, oeuv28, "Anglais") ;
		AudioBook audio225 = new AudioBook (225, oeuv28, "Français") ;
		AudioBook audio228 = new AudioBook (228, oeuv33, "Anglais") ;
		AudioBook audio229 = new AudioBook (229, oeuv31, "Français") ;
		
		AudioBook [] audios = {audio223, audio224, audio225, audio228, audio229 } ;
		
	}

}
