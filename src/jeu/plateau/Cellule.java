package jeu.plateau;

import jeu.entite.Robot;

public abstract class Cellule {
	protected int mine=0;
	protected int base=0;
	private int largeur,hauteur;
	private String image;
	private Robot r ;

	/**
	 * 
	 * @param largeur
	 * @param hauteur
	 * Cree une cellule , avec pour parametres sa largeur et sa hauteur
	 */
	public Cellule(int largeur,int hauteur){
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	/**
	 * 
	 * @return 0 si pas de mine, sinon retourne le numero de l'equipe
	 */
	public int contientMine(){
		return mine;
	}

	/**
	 * Pose une mine sur la cellule
	 * @param numero de l'equipe ayant pose la mine
	 */
	public void poseMine(int equipe) {
		this.mine = mine;
	}

	/**
	 * 
	 * @return l'image de la cellule
	 */
	public String getImage() {
		return image;
	}

	/**
	 * 
	 * @param image, l'image qui va etre affectee a la cellule	
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * 
	 * @param base, representant le numero de l'equipe a qui appartient la base
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * 
	 * @return 0 si la cellule n'est pas une base , sinon le numero de l'equipe a qui appartient la base
	 */
	public int estBase(){
		return base;
	}

	/**
	 * 
	 * @return Coordonnees
	 * retourne la coordonnee correspondant a la largeur & a la hauteur de la cellule
	 */
	public Coordonnees getCoordonnees(){
		return new Coordonnees(largeur,hauteur);
	}

	/**
	 * 
	 * @return robot
	 * retourne le robot contenu dans la cellule
	 */
	public Robot getContenu(){
		return r;
	}

	/**
	 * 
	 * @return la largeur de la cellule
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * 

	 * @return la hauteur de la cellule
	 */
	public int getHauteur() {
		return hauteur;
	}

	/**
	 * enleve le robot de la cellule
	 * 
	 */
	public void videContenu(){
		this.r=null;
		this.mine=0;
	}
	
	/**
	 * 
	 * @return true si la cellule contient un robot ou une mine, sinon false
	 */
	public boolean estVide(){
		if(this.getContenu().equals(null) && this.contientMine()==0){
			return true;
		}
		else return false;
	}

	/**

	 * enleve la mine de la cellule
	 */
	public void videMine(){
		if(this.contientMine() != 0){
			this.mine=0;
		}
	}

	/**
	 * @return l'image en fonction du contenu de la cellule
	 */
	public String toString(){
		return this.image;
	}
	
	
	
	abstract void deplaceSur(Robot robot);
	abstract void ajoute(int equipe);
	abstract void videCase();
}
