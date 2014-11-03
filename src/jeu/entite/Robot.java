package jeu.entite;
import java.util.List;

import jeu.plateau.Coordonnees;
import jeu.plateau.Vue;

 
public abstract class Robot {
	private int energie,equipe,hauteur,largeur;
	private Vue v;
	public Robot(Vue vue,int l,int h,int equipe){
		this.v=vue;
		this.largeur=l;
		this.hauteur=h;
		this.equipe=equipe;
	}
	abstract public boolean peutTirer();
	
	public boolean estSurBase(){
		return false;
	}
	public void setCoordonnees(Coordonnees coordonnees){
		
	}
	public Vue getVue(){
		return v;
	}
	public int getEnergie(){
		return energie;
	}
	public void setEnergie(int energie){
		this.energie=energie;
	}
	public int getEquipe(){
		return equipe;
	}
	abstract public int getCoutAction();
	abstract public int getCoutDep();
	abstract public int getDegatTir();
	abstract public int getDegatMine();
	abstract public String getType();
	abstract public List<Coordonnees> getDeplacements();
	
	public void setVue(Vue vue){
		
	}
	public String toString(){
		return "Equipe : "+equipe+"\tCoordonnees : "+new Coordonnees(largeur,hauteur).toString()+"\nEnergie : "+energie;
	}
	public void subitTir(){
	}
	public void subitMine(){
		
	}
	
}