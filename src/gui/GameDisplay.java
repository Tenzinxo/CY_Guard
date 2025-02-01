package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import environnement.Grille;

public class GameDisplay extends JPanel{
	
	private Grille grille;
	
	public GameDisplay(Grille grille) {
		this.grille = grille;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
