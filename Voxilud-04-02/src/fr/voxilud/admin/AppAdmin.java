package fr.voxilud.admin;

public class AppAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abonnement abn1 = new Abonnement (201, "2021-01-03") ;
		// System.out.println(abn1.toString());
		Abonnement abn2 = new Abonnement (202, "2021-01-10") ;
		// System.out.println(abn2.toString());
		// System.out.println(Abonnement.getdureeAbonnement());
		Abonnement.setdureeAbonnement(5);
		// System.out.println(Abonnement.getdureeAbonnement());
		abn1.setdureeAbonnement(7);
		System.out.println(abn1.getdureeAbonnement());
		System.out.println(abn2.getdureeAbonnement());
		System.out.println(Abonnement.getdureeAbonnement());
	}

}
