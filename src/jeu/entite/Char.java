package jeu.entite;

import java.util.List;

import jeu.plateau.Coordonnees;
import jeu.plateau.Vue;

public class Char extends Robot{

	public Char(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
		this.setEnergie(60);
	}

	
	public boolean peutTirer() {
		return this.getEnergie()>this.getCoutAction();
	}

	
	public int getCoutAction() {
		return 1;
	}

	
	public int getCoutDep() {
		return 5;
	}

	
	public int getDegatTir() {
		return 6;
	}

	
	public int getDegatMine() {
		return 6;
	}

	
	public String getType() {
		return "Char";
	}

	
	public List<Coordonnees> getDeplacements() {
		return null;
	}

}
