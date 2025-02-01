package gui;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import config.GameConfiguration;
import environnement.Grille;

public class MainGUI extends JFrame implements Runnable{
	
	private static Dimension preferredsize = new Dimension(GameConfiguration.WINDOW_WIDTH,GameConfiguration.WINDOW_HEIGHT);
	
	
	private Grille grille;
	
	

	public MainGUI(String title) throws HeadlessException {
		super(title);
		init();
		// TODO Auto-generated constructor stub
	}

	private void init() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public class KeyControls implements KeyListener{
		
		@Override
		public void keyPressed(KeyEvent e) {
			char keychar = e.getKeyChar();
			switch (keychar) {
			
			case 'a':
				//manager.moveleftGardien;
				break;
			
			case 'd':
				//manager.moverightGardien;
				break;
				
			case 'w':
				//manager.moveupGardien;
				break;
				
			case 's':
				//manager.movedownGardien;
				break;
			default:
				break;
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}

	}
}
