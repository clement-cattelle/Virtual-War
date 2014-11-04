package jeu.plateau;

import jeu.entite.Robot;

public class Case extends Cellule{
	
	/**
	 * 
	 * @param largeur
	 * la largeur a laquelle se trouve la case
	 * 
	 * @param hauteur
	 * la hauteur a laquelle se trouve la case
	 */
	public Case(int largeur, int hauteur) {
		super(largeur, hauteur);
		
	}

	void deplaceSur(Robot robot) {
		robot.setCoordonnees(new Coordonnees(super.getLargeur(),super.getHauteur()));
			
		
	}
	/**
	 * pose une mine sur une case, avec en parametre le numero de l'equipe
	 */
	void ajoute(int equipe) {
		this.poseMine(equipe);
	}
	
	/**
	 * nettoye le contenu de la case
	 */
	void videCase() {
		this.videContenu();
		this.videMine();
	}
	
	public String toString(){
		return super.toString();
	}
}