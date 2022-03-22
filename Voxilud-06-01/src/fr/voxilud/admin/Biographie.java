package fr.voxilud.admin;

public class Biographie extends Oeuvre {
		
		private String personnage ;

		public Biographie(int numero, String titre, int nombreAudiobooks, String personnage) {
			super(numero, titre, nombreAudiobooks);
			this.personnage = personnage;
		}

		public String getPersonnage() {
			return personnage;
		}

		public void setPersonnage(String personnage) {
			this.personnage = personnage;
		}
		
		public void toHtml() { 
			if( super.getNombreAudiobooks() < NB_AUDIOBOOKS_MAX ){
				System.out.println("<div>\n" + super.getNumero() + " (" + super.getNombreAudiobooks() + " produits)\n" + personnage + "\n" + super.getTitre() + "\n" + "</div>"  );
			}
			else {
				System.out.println("<div>\n" + super.getNumero() + " (<strong>Production bloquée</strong>)\n" + personnage + "\n" + super.getTitre() + "\n" + "</div>");
			}
		}

		@Override
		public String toString() {
			return "Biographie [" + super.toString() + " personnage = " + personnage + "]";
		}

		
		
		
		
	}
	
	
	
	


