package fr.voxilud.admin;

public class AppSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auditeur mem289 = new Auditeur(289, "Selma", "selma.dradri@gmail.com", "Anglais", 35) ;
		//mem289.toHtml() ;
		
		Lecteur mem518 = new Lecteur(518, "Jules", "jules.allouche@gmail.com", "Polonais", 4) ;
		mem518.toHtml() ;		
	}

}
