package jeu.action;

import jeu.entite.Robot;
import jeu.plateau.Coordonnees;

public class Deplacement extends Action{

	/**
	 * Cree un deplacement a effectuer par le robot, aux coordonnees specifiees (relatives au robot). 
     * @param r le robot qui fait l'action
	 * @param direction la direction dans laquelle il fait l'action (relative a sa position)
	 */
	public Deplacement(Robot robot, Coordonnees direction) {
		super(robot, direction);
	}

	void agit() {
		
	}

}