package jeu.action;
import jeu.entite.Robot;
import jeu.plateau.Coordonnees;

public abstract class Action {
	private Coordonnees coord;
	private Robot robot;
	
	/**
     * renvoie le robot qui execute l'action
     * @return Robot
     */
	public Robot getRobot(){
		return this.robot;
	}

    /**
     * renvoie la direction ou effectuer l'action (relatif au robot)
     * @return Coordonnees
     */
	public Coordonnees getDirection(){
		return this.coord;
	}
	
	public Coordonnees getObjectif(){
		
	}
	public Action(Robot robot,Coordonnees direction){
		this.robot=robot;
		this.coord=coord;
	}
	abstract void agit();
}