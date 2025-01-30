package utilitaire;

/**
 * Test
 */
public class Coordonnee {
	private int x;
	private int y;
	
	public Coordonnee(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;	
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Coordonnee coordonnee) {
		if (this.x == coordonnee.getX() && this.y == coordonnee.getY()) {
			return true;
		}
		return false;
	}
}
