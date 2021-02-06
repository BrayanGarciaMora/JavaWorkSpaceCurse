package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco dimension = new MarcoFoco(50, 200);
		dimension.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame {

	public MarcoFoco(int x, int y) {

		setVisible(true);
		setBounds(x, y, 400, 500);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null); // INVALIDACION DEL LAYOUT

		cuadro1 = new JTextField();
		cuadro2 = new JTextField();

		cuadro1.setBounds(100, 10, 200, 20);
		cuadro2.setBounds(100, 100, 200, 20);

		add(cuadro1);
		add(cuadro2);

		LanzaFocos elFoco = new LanzaFocos();

		cuadro1.addFocusListener(elFoco);
	}

	private class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			String email = cuadro1.getText();
			boolean validar = false;

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					validar = true;
				}
			}

			if (validar) {
				System.out.println("correcto");
			} else {
				System.out.println("incorrecto");
			}

		}

	}

	JTextField cuadro1;
	JTextField cuadro2;
}
