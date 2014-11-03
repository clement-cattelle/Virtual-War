public class Base extends Cellule{

	public Base(int largeur, int hauteur) {
		super(largeur, hauteur);

	}

	public void deplaceSur(Robot robot) {
		robot.setCoordonnees(new Coordonnees(getLargeur(),getHauteur()));
	}

	public void ajoute(int equipe) {
		if(equipe ==1 || equipe == 2){
			this.setBase(equipe);

			if(equipe==1){
				this.setImage("B");
			}
			else{
				this.setImage("b");
			}
		}
	}

	/**
	 * vide le contenu de la base
	 */
	public void videCase() {
		this.videContenu();
		this.videMine();

	}

}