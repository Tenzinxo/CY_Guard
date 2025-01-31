package personnage;

import utilitaire.GenerateurNom;
import environnement.Case;

public abstract class Personnage {
	
	private Case caseActuel;
	private String name;
	private long tempsInvocation;
	
	public Personnage(Case caseActuel) {
		this.caseActuel = caseActuel;
		this.name = GenerateurNom.genererNom();
		this.tempsInvocation = System.currentTimeMillis();
	}
	
	public Case getCase() {
		return caseActuel;
	}

	public void setCase(Case caseActuel) {
		this.caseActuel = caseActuel;
	}

	public String getName() {
		return name;
	}

	public long getTempsInvocation() {
		return tempsInvocation;
	}
}