package jeu.plateau;

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
	                cel = plateau[i][j]; 
	                str = ""; 
	                
	                if (i==0 && j==0){
	                	str += "B";
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
	public static void main(String[] args){
		Plateau p=new Plateau();
		p.afficherPlateau();
	}
}