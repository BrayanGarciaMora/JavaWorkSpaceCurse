package graficos;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class KeyEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTecla marco = new MarcoConTecla(820, 110);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTecla extends JFrame {

	public MarcoConTecla(int x, int y) {

		setBounds(x, y, 400, 400);
		setVisible(true);
		KeyEvent keycode = new KeyEvent();
		addKeyListener(keycode);
	}

}

class KeyEvent implements KeyListener {

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		// int codigo = e.getKeyCode();
		// System.out.print(codigo);
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		char Letra = e.getKeyChar();
		System.out.print(Letra);
	}

}