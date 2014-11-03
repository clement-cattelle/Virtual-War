public class Coordonnees {
	private int largeur,hauteur;
	
	public Coordonnees(int largeur,int hauteur){
		this.largeur=largeur;
		this.hauteur=hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}
	
	public String toString(){
		return "hauteur :"+hauteur+"\nlargeur :"+largeur;
	}
	public Coordonnees ajout(Coordonnees coord){
		return new Coordonnees(this.largeur+coord.getLargeur(),this.hauteur+coord.getHauteur());
		
	}
}