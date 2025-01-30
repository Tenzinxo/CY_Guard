package environnement;
import personnage.Gardien;
import personnage.Intrus;

import java.util.HashMap;

public class Grille {
	
	private Case[][] cases;
	
	private HashMap<Case, Intrus> intrus = new HashMap<Case, Intrus>();
	private HashMap<Case, Gardien> gardiens = new HashMap<Case, Gardien>();
	
	
}