package fr.voxilud.admin;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecteur lecteur1 = new Lecteur(101, "GENPRI", "Erwan", 20) ;
		//System.out.println(lecteur1.toString()) ;
		//System.out.println(lecteur1.getnom()) ;
		Lecteur lecteur2 = new Lecteur(102, "NONATO", "Isabella", 0) ;
		//System.out.println(lecteur2.toString()) ;
		//System.out.println(lecteur2.getnom()) ;
		lecteur2.setnom( "GENPRI" ) ;
		//System.out.println(lecteur2.getnom()) ;
		
		if( lecteur1.estActif() == true){
			System.out.println( "Lecteur actif" ) ;
		}
		else {
			System.out.println( "Lecteur passif" ) ;
		}
		
		if( lecteur2.estActif() == true){
			System.out.println( "Lecteur actif" ) ;
		}
		else {
			System.out.println( "Lecteur passif" ) ;
		}
		
		System.out.println("Nombre d'audios produits par le lecteur n° 101 : " + lecteur1.getnombreAudiosProduits()) ;
		lecteur1.produireUnAudio() ;
		System.out.println("Nombre d'audios produits par le lecteur n° 101 : " + lecteur1.getnombreAudiosProduits()) ;
	}
}
