package jeu.entite;
import java.util.List;

import jeu.plateau.Coordonnees;
import jeu.plateau.Vue;


public class Piegeur extends Robot{
	
	/**
	 * 
	 * @param vue 
	 * @param l
	 * @param h
	 * @param equipe
	 */
	public Piegeur(Vue vue, int largeur, int hauteur, int equipe) {
		super(vue, largeur, hauteur, equipe);
		this.setEnergie(50);
	}

	/**
	 * @return true si le robot peut poser sa mine, sinon return false
	 * 
	 */
	public boolean peutTirer() {
		
		return false;
	}

	/**
	 * @return 2 , le cout d'une action pour un piegeur
	 */
	public int getCoutAction() {
		
		return 2;
	}

	/**
	 * @return 2, le cout d'un deplacement pour un piegeur
	 */
	public int getCoutDep() {
		
		return 2;
	}

	/**
	 * @return 2, l'energie qu'un piegeur perd en essuyant un tir ennemi
	 */
	public int getDegatTir() {
		
		return 2;
	}

	/**
	 * @return 2, l'energie qu'un piegeur perd en marchant sur une mine
	 */
	public int getDegatMine() {
		return 2;
	}

	/**
	 * return le type de robot
	 */
	public String getType() {
		return "Piegeur";
	}

	/**
	 * euh...
	 */
	public List<Coordonnees> getDeplacements() {
		
		return null;
	}
	
	
	
}