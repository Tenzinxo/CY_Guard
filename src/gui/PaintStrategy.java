package gui;

import java.awt.Color;
import java.awt.Graphics;

import config.GameConfiguration;
import environnement.Case;
import environnement.Grille;

public class PaintStrategy {
	
	public void paint(Grille grille, Graphics graphics) {
		
		int blocksize = GameConfiguration.BLOCK_SIZE;
		Case[][] cases = grille.getgrille();
		int nbLigne = grille.getNbLigne();
		int nbColonne = grille.getNbColonne();
		
		for (int line = 0; line < nbLigne; line++) {
			for (int col = 0; col < nbColonne; col++) {
				Case casecell = cases[line][col];
				graphics.setColor(Color.black);
			}
		}
		
		
		
		//completer
	};
	
	
}
