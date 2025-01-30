package personnage;

import utilitaire.Coordonnee;

public abstract class Personnage {
	
	private Coordonnee position;
	private String name;
	private long tempsInvocation;
	
	public Coordonnee getPosition() {
		return position;
	}

	public void setPosition(Coordonnee position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public long getTempsInvocation() {
		return tempsInvocation;
	}

	public Personnage(String name, Coordonnee position, long tempsInvocation) {
		this.name = name;
		this.position = position;
		this.tempsInvocation = tempsInvocation;
	}
}