package jeu.plateau;

import jeu.entite.Robot;

public class Vue {
	
	private int equipe;
	private Plateau p;
	
	public Vue(int equipe,Plateau p){
		this.equipe=equipe;
		this.p=p;
	}
	
	public void poserRobot(Robot r,Coordonnees c){
		
	}
	
	public boolean estOk(Coordonnees c){
		if(!(c.getLargeur()>=0 || c.getLargeur()<p.getLargeur() || c.getHauteur()>=0 || c.getHauteur()<p.getHauteur())){
			return false;
		}
		return true;
	}
	
	public void poseMine(Robot r,Coordonnees c){
		
		
		
	}
	
}
package jeu.plateau;
public class Vue{
	
}package jeu.plateau;

import jeu.entite.Robot;

public class Vue {
	
	private int equipe;
	private Plateau p;
	
	public Vue(int equipe,Plateau p){
		this.equipe=equipe;
		this.p=p;
	}
	
	public void poserRobot(Robot r,Coordonnees c){
		
	}
	
	public boolean estOk(Coordonnees c){
		if(!(c.getLargeur()>=0 || c.getLargeur()<p.getLargeur() || c.getHauteur()>=0 || c.getHauteur()<p.getHauteur())){
			return false;
		}
		return true;
	}
	
	public void poseMine(Robot r,Coordonnees c){
		
		
		
	}
	
}
