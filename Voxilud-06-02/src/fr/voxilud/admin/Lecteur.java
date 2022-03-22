package fr.voxilud.admin;

public class Lecteur extends Membre {

	private String langueMat ;
	private int maitrise ;
	
	public Lecteur(int numero, String nom, String email, String langueMat, int maitrise) {
		super(numero, nom, email);
		this.langueMat = langueMat;
		this.maitrise = maitrise;
	}

	public String getLangueMat() {
		return langueMat;
	}

	public void setLangueMat(String langueMat) {
		this.langueMat = langueMat;
	}

	public int getMaitrise() {
		return maitrise;
	}

	public void setMaitrise(int maitrise) {
		this.maitrise = maitrise;
	}

	public void toHtml() { 
		System.out.println("<span id=\'" + super.getNumero() + "\' class=\'lecteur\'>\n" + super.getNom() + "(<em>" + langueMat + "</em>)\n"+ "</span>");
	}
	
	public void toHtml(int mode) {
		if( mode == 1){
			System.out.println("<div id=\'" + super.getNumero() + "\' class=\'lecteur\'>\n" + super.getNom() + "\n<br />\n" + "Degré de maîtrise : " + maitrise + "\n</div>" ) ;
		}
		if( mode == 2){
			System.out.println("<div id=\'" + super.getNumero() + "\' class=\'lecteur\'>\n" + super.getNom() + "\n<br />\n" + "Langue maternelle : " + langueMat + "\n</div>" ) ;
		}
		if( mode == 3){
			System.out.println("<div id=\'" + super.getNumero() + "\' class=\'lecteur\'>\n" + super.getNom() + "\n<br />\n" + "Degré de maitrise : " + maitrise + "\n<br/>\nPréférence : " + langueMat + "\n</div>" ) ;
		}
	}
	
	@Override
	public String toString() {
		return "Lecteur [" + super.toString() + " langueMat = " + langueMat + ", maitrise =" + maitrise + "]";
	}
	
	
}
