package personnage;

import utilitaire.GenerateurNom;
import environnement.Case;

public abstract class Personnage {
	
	private Case caseActuel;
	private String name = GenerateurNom.genererNom();
	private long tempsInvocation;
	
	public Personnage(Case caseActuel, long tempsInvocation) {
		this.caseActuel = caseActuel;
		this.tempsInvocation = tempsInvocation;
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