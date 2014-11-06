package jeu;


import java.util.ArrayList;
import java.util.List;

import jeu.plateau.Coordonnees;

public class Constante {
	
	public static Coordonnees HAUT = new Coordonnees(0,-1);
	public static Coordonnees BAS = new Coordonnees(0,1);
	public static Coordonnees GAUCHE = new Coordonnees(-1, 0);
	public static Coordonnees DROITE = new Coordonnees(1,0);
	
	public static List<Coordonnees> liste = new ArrayList<Coordonnees>();
	static{
		liste.add(BAS);
		liste.add(HAUT);
		liste.add(GAUCHE);
		liste.add(DROITE);
	}
}
