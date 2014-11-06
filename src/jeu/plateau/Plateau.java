
package jeu.plateau;



import jeu.entite.Robot;
import jeu.entite.Tireur;


public class Plateau {
	int hauteur,largeur;
	Cellule[][] plateau;
	/**
	 * cree un tableau de cellule a 2dimensions pour representer le plateau
	 */
	public Plateau(){
		this.hauteur=10;
		this.largeur=5;
		plateau=new Cellule[hauteur][largeur];
	}
	
	public Cellule getCellule(int x,int y){
		return plateau[x][y];
	}
	public void poserMine(int x,int y){
		if(plateau[x][y].estVide()){
			plateau[x][y].poseMine(1);
		}
	}
	
	public boolean estVide(int x,int y){
		return plateau[x][y].estVide();
	}
	
	/**
	 * Affiche le plateau avec son contenu
	 */
	public void afficherPlateau() {	
		 	String str; 
	        Cellule cel; 
	        // v  On cree le haut du plateau , avec l'affichage des coordonnees en largeur 
	        System.out.print("    "); 
	        for (int i = 0; i < this.largeur; i++) { 
	            if (i < 10) System.out.print(" "+ i + "  "); 
	            else System.out.print("" + i + "  "); 
	        } 
	        System.out.print("\n   +"); 
	        for (int i = 0; i < largeur; i++) { 
	            System.out.print("---+"); 
	        } 
	        System.out.println(""); 
	        
	        // ^ on cree le haut du plateau, avec l'affichage des coordonnees en largeur ^ //
	        
	        
	        
	        for (int i=0;i<hauteur;i++) { 
	            for (int j=0; j<largeur;j++) { 
	                //cel = plateau[i][j]; 
	                str = ""; 
	                if (i==0 && j==0){
	                	plateau[i][j] = new Base(i, j);
	                	plateau[i][j].ajoute(1);
	                	System.out.print(plateau[i][j]);
	                } else if(i == hauteur-1 && j == largeur-1) {
	                	plateau[i][j] = new Base(i,j);
	                	plateau[i][j].ajoute(2);
	                	/*if(plateau[i][j].getContenu().getType().equals("Tireur")){
	                		System.out.println(plateau[i][j].getContenu());
	                	}*/
	                	 System.out.print(plateau[i][j]);
	                } else if(j == largeur-1 && i != 0) {
	                	str += "   |   | ";
	                	plateau[i][j] = new Case(i, j);
	                }
	                else { 
	                    str += "   |"; 
	                } 
	              
	                System.out.print(str); 
	   
	            } 
	            System.out.print("\n   +"); 
	            for (int p = 0;p < largeur; p++) { 
	                System.out.print("---+"); 
	            } 
	            System.out.println(""); 
	        }        
	        System.out.println(""); 
	}
	
	/**
	 * 
	 * @return la hauteur du plateau
	 *  
	 */
	public int getHauteur() {
		return hauteur;
	}

	/**
	 * 
	 * @return la largeur du plateau
	 * 
	 */
	public int getLargeur() {
		return largeur;
	}
	
	public void addRobot(Robot r,int equipe) {
		r.setCoordonnees(new Coordonnees(0,0));
		
	}
	public static void main(String[] args){
		Plateau p=new Plateau();
		//p.afficherPlateau();
		Vue v1=new Vue(1,p);
		Tireur t=new Tireur(v1, 3, 5, 1);
		p.addRobot(t, 1);
		t.setCoordonnees(new Coordonnees(5,3));
		p.poserMine(3, 3);
		p.afficherPlateau();
		
	}
}
