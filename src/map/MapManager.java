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
		placerObstacles(GameConfiguration.LAC, GameConfiguration.NB_LAC, GameConfiguration.DENSITE_LAC);
		placerObstacles(GameConfiguration.ROCHE, GameConfiguration.NB_ROCHE, GameConfiguration.DENSITE_ROCHE);
		placerObstacles(GameConfiguration.ARBRE, GameConfiguration.NB_ARBRE, GameConfiguration.DENSITE_ARBRE);
	}
	
    private void initProba() {
        List<Coordonnee> coordonnees = new ArrayList<>();
        for (int i = 0; i < GameConfiguration.NB_LIGNE; i++) {
            for (int j = 0; j < GameConfiguration.NB_COLONNE; j++) {
                Coordonnee position = new Coordonnee(i, j);
                if (grille.getCase(position).getObstacle().equals(GameConfiguration.PLAINE)) {
                    coordonnees.add(position);
                }
            }
        }
        double probaInitiale = 100.0;
        MapProbaCoordonnee.put(probaInitiale, coordonnees);
    }
	
	private void placerObstacles(Obstacle obstacle, int nombreObstacles, int densite) {
		initProba();
		int obstaclesPlaces = 0;
        while (obstaclesPlaces < nombreObstacles) {
            List<Coordonnee> coordonnees = getListeProba(getValeurAleatoire());
            if (coordonnees != null && !coordonnees.isEmpty()) {
                Coordonnee coordAleatoire = getCoordonneeAleatoire(coordonnees);
                if (coordAleatoire != null) {
	                grille.getCase(coordAleatoire).setObstacle(obstacle);
	                List<Coordonnee> casesAdjacentes = getCasesAdjacentes(coordAleatoire, GameConfiguration.NB_CASE_DENSITE);
	                augmenterProbabilite(casesAdjacentes, densite);
	                obstaclesPlaces++;
                }
            }
        }
    }

	private List<Coordonnee> getListeProba(double valeurAleatoire) {
		// TODO Auto-generated method stub
		return null;
	}

	private Coordonnee getCoordonneeAleatoire(List<Coordonnee> coordonnees) {
		if (coordonnees == null || coordonnees.isEmpty()) {
			return null;
		}
		int index = (int) (Math.random() * coordonnees.size());
		return coordonnees.get(index);
	}

	private List<Coordonnee> getCasesAdjacentes(Coordonnee coordAleatoire, int nbCaseDensite) {
		// TODO Auto-generated method stub
		return null;
	}

	private void augmenterProbabilite(List<Coordonnee> casesAdjacentes, int densite) {
		// TODO Auto-generated method stub
		
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
