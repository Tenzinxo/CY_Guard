package map;

import map.obstacle.Obstacle;
import utilitaire.Coordonnee;
import config.GameConfiguration;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.Set;

public class MapManager {
	private Grille grille;
    private TreeMap<Double, Set<Coordonnee>> probaCases = new TreeMap<>();
	
    public MapManager() {
        this.grille = new Grille(GameConfiguration.NB_LIGNE, GameConfiguration.NB_COLONNE);
        initProba();
    }

    private void initProba() {
        Set<Coordonnee> coordonnees = new HashSet<>();
        for (int i = 0; i < GameConfiguration.NB_LIGNE; i++) {
            for (int j = 0; j < GameConfiguration.NB_COLONNE; j++) {
                Coordonnee position = new Coordonnee(i, j);
                if (grille.getCase(position).getObstacle().getType().equals("Plaine")) {
                    coordonnees.add(position);
                }
            }
        }
        double probaInitiale = 100.0 / (GameConfiguration.NB_LIGNE * GameConfiguration.NB_COLONNE);
        probaCases.put(probaInitiale, coordonnees);
    }
	
	public void genererCarte() {
	    placerLacs();
	    placerRochers();
	    placerArbres();
	}
	
	private void placerLacs() {
	    
	}

	private void placerRochers() {
	    
	}

	private void placerArbres() {
	    
	}
	
	// Recuperation de la densité dans config 
	// Recuperation du nombre de tuiles pour les obstacles
	
	// Ajout des trois tuiles aléatoirement 
	
	// Faire en sorte d'augmenter la proba du spawn a côté avec un parametre défini dans config pour chaque obstacles
	
	// Refaire une itération
	
	// Boucler jusqu'au nombre de tuiles demandé   ?? A voir si on fait une boucle par tuiles ou de chaque.
	
}
