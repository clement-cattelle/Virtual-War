package jeu.entite;
import java.util.List;

import jeu.plateau.Coordonnees;
import jeu.plateau.Vue;


public class Tireur extends Robot{

	public Tireur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
		
	}

	/**
	 * @return true si le robot peut tirer ,sinon false
	 */
	public boolean peutTirer() {
	}

	/**
	 * @return 2 pour tirer
	 */
	public int getCoutAction() {
		return 2;
	}

	/**
	 * @return 1 pour se déplacer
	 */
	public int getCoutDep() {
		return 1;
	}

	/**
	 * return 3 quand le tireur essuye un tir ennemi
	 */
	public int getDegatTir() {
		return 3;
	}

	/**
	 * return 3 quand le tireur marche sur une mine
	 */
	public int getDegatMine() {
		return 3;
	}

	/**
	 * @return Tireur
	 */
	public String getType() {
		return "Tireur";
	}

	
	public List<Coordonnees> getDeplacements() {
		return null;
	}
	
}
