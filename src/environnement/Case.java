package environnement;

import environnement.obstacle.Obstacle;
import util.Coordonnee;

/**
 * Représente une case de la grille.
 */
public class Case {
	private Coordonnee position;
	private Obstacle obstacle;
	
	public Case(Coordonnee position, Obstacle obstacle) {
		this.position = position;
		this.obstacle = obstacle;
	}
	
	public Coordonnee getPosition() {
		return this.position;
	}
	
	public void setPosition(Coordonnee position) {
		this.position = position;
	}
	
	public Obstacle getObstacle() {
		return this.obstacle;
	}
	
	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}
}
