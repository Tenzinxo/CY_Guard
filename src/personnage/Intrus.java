package personnage;

import environnement.Case;
import config.GameConfiguration;

public class Intrus extends Personnage {

	public Intrus(Case caseActuelle) {
		super(caseActuelle);
		setVitesse(GameConfiguration.INTRUS_SPEED);
	}
}