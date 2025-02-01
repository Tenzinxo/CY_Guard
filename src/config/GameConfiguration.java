package config;

public class GameConfiguration {
	
	public static final int VITESSE_INTRUS = 10;
	public static final int VITESSE_GARDIENS = 12;
	
	public static final int DIFFICULTE = 1;
	
	public static final int NB_LIGNE = 25;
	public static final int NB_COLONNE = 25;
	
	public static final int DENSITE_ROCHE = 20;
	public static final int NB_ROCHE = (NB_LIGNE*NB_COLONNE)/(8*DIFFICULTE);
	
	public static final int DENSITE_ARBRE = 5;
	public static final int NB_ARBRE = (NB_LIGNE*NB_COLONNE)/(10*DIFFICULTE);	
	
	public static final int DENSITE_LAC = 40;
	public static final int NB_LAC = (NB_LIGNE*NB_COLONNE)/(6*DIFFICULTE);	
	
	
	public static final boolean PERMET_DEPLACEMENT_DIAGONNAL = true;
}
