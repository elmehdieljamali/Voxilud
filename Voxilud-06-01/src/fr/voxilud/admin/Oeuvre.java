package fr.voxilud.admin;

public class Oeuvre {

	private int numero ;
	private String titre ;
	private int nombreAudiobooks ;
	public static final int NB_AUDIOBOOKS_MAX = 5 ;
	
	public Oeuvre(int numero, String titre, int nombreAudiobooks) {
		super();
		this.numero = numero;
		this.titre = titre;
		this.nombreAudiobooks = nombreAudiobooks;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getNombreAudiobooks() {
		return nombreAudiobooks;
	}
	
	public void setNombreAudiobooks(int nombreAudiobooks) {
		this.nombreAudiobooks = nombreAudiobooks;
	}
	
	public static int getNbAudiobooksMax() {
		return NB_AUDIOBOOKS_MAX;
	}
	
	public void toHtml() { 
		if( this.nombreAudiobooks < NB_AUDIOBOOKS_MAX ){
			System.out.println("<div>\n" + numero + " (" + nombreAudiobooks + " produits)\n" + titre + "\n" + "</div>"  );
		}
		else {
			System.out.println("<div>\n" + numero + " (<strong>Production bloquée</strong>)\n" + titre + "\n" + "</div>");
		}
	}
	
	@Override
	public String toString() {
		return "Oeuvre [numero = " + numero + ", titre = " + titre + ", nombreAudiobooks = " + nombreAudiobooks + "]";
	}
}
