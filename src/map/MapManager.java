package map;

import map.obstacle.Obstacle;
import utilitaire.Coordonnee;
import config.GameConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapManager {
	private Grille grille;
	private Map<Double, List<Coordonnee>> MapProbaCoordonnee = new HashMap<>();
	
    public MapManager() {
        this.grille = new Grille(GameConfiguration.NB_LIGNE, GameConfiguration.NB_COLONNE);
        genererCarte();
    }
	
	public void genererCarte() {
		placerObstacles("Lac", GameConfiguration.NB_LAC, GameConfiguration.DENSITE_LAC);
		placerObstacles("Roche", GameConfiguration.NB_ROCHE, GameConfiguration.DENSITE_ROCHE);
		placerObstacles("Arbre", GameConfiguration.NB_ARBRE, GameConfiguration.DENSITE_ARBRE);
	}
	
    private void initProba() {
        List<Coordonnee> coordonnees = new ArrayList<>();
        for (int i = 0; i < GameConfiguration.NB_LIGNE; i++) {
            for (int j = 0; j < GameConfiguration.NB_COLONNE; j++) {
                Coordonnee position = new Coordonnee(i, j);
                if (grille.getCase(position).getObstacle().getType().equals("Plaine")) {
                    coordonnees.add(position);
                }
            }
        }
        double probaInitiale = 100.0;
        MapProbaCoordonnee.put(probaInitiale, coordonnees);
    }
	
	private void placerObstacles(String typeObstacle, int nombreObstacles, int densite) {
		initProba();
		int obstaclesPlaces = 0;
        while (obstaclesPlaces < nombreObstacles) {
        	double valeurAleatoire = getValeurAleatoire();
        	return;
        }
    }
	
	private static double getValeurAleatoire() {
	    return (double) Math.random() * 100;
	}
	
	// On met une liste de coordonnee avec une proba (au début 100 pour l'ensemble de la liste)
	
	// On prend un nombre aléatoire entre 0 et 100 
	// On prend la treeMap de proba et on va jusqu'a atteindre le chiffre 
	// On choisi aléatoirement une coordonnées dans cette liste de proba
	// On met l'obstacle demandé et on le retire de la liste 
	// On récupère les cases adjacentes(nb_case) pour augmenter leurs proba (confus encore)
	
	// Refaire une itération
	// Faire une boucle par type de tuile : Lac -> Roche -> Arbre
	
}
