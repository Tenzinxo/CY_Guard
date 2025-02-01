package personnage;

import config.GameConfiguration;
import map.Case;

public class Intrus extends Personnage {

	public Intrus(Case caseActuelle) {
		super(caseActuelle);
		setVitesse(GameConfiguration.VITESSE_INTRUS);
	}
}