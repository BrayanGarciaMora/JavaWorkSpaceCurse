package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTexto marco = new MarcoConTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer texto");

		Lamina lamina1 = new Lamina();
		add(lamina1);

	}

}

class Lamina extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("aprendiendo", 0, 20);
		g.drawString("aprendiendo1 a como escribir en un marco", 1, 40);
		g.drawString("aprendiendo1 a como escribir en un marco", 20, 50);

	}

}