package fr.voxilud.admin;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oeuvre oeuvre103 = new Oeuvre (103, "Le Crépuscule et l'Aube") ;
		// System.out.println(oeuvre103.toString()) ;
		// System.out.println(Oeuvre.getnbOeuvres()) ;
		Oeuvre oeuvre302 = new Oeuvre (302, "Nature Humaine") ;
		// System.out.println(oeuvre302.toString()) ;
		// System.out.println(Oeuvre.getnbOeuvres()) ;
		Oeuvre oeuvre318 = new Oeuvre (318, "L'anomalie") ;
		// System.out.println(oeuvre318.toString()) ;
		// System.out.println(Oeuvre.getnbOeuvres()) ;
		System.out.println(oeuvre103.getnbOeuvres()) ;
	}

}
