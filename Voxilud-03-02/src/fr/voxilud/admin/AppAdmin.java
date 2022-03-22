package fr.voxilud.admin;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluation eval1 = new Evaluation(1, 5, "Excellent !!!", 23, true) ;
		//System.out.println(eval1.toString()) ;
		eval1.aime() ;
		System.out.println("Nombre de J'aime de l'évaluation numéro 1 : " + eval1.getnombreDeJAime()) ;
	}
}
