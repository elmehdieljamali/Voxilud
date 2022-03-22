package fr.voxilud.admin;

public class appSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oeuvre oeuvre1 = new Oeuvre (1, "Au revoir là-haut", 2) ;
		System.out.println(oeuvre1.toString());
		oeuvre1.toHtml() ;
		
		Oeuvre oeuvre2 = new Biographie (2, "Hannibal", 5, "Hannibal Barca") ;
		System.out.println(oeuvre2.toString());
		oeuvre2.toHtml() ;
	}

}
