package graficos;

import java.awt.*;
import javax.swing.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConImagen miMarco = new MarcoConImagen();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConImagen extends JFrame {

	public MarcoConImagen() {

		setTitle("Marco Con imagenes");
		setVisible(true);
		setBounds(100, 50, 950, 450);
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
}

class LaminaConImagen extends JPanel {

	public void paintComponent(Graphics g) {
		String pedir,pedir1;
		int a, b;
		
		pedir = JOptionPane.showInputDialog("Bolas bajo");
		a =  Integer.parseInt(pedir);
		pedir1 = JOptionPane.showInputDialog("Bolas derechas");
		b =  Integer.parseInt(pedir1);

		super.paintComponent(g);
		// File miImagen = new File("src/graficos/carro.png");
		try {
			imagen = ImageIO.read(new File("src/graficos/Bola.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No encuentro la imagen");
		}

		g.drawImage(imagen, 0, 0, null);
	

		for (int x = 0; x < b; x++) {
			for (int y = 0; y < a; y++) {
				g.copyArea(0, 0, 25, 26, 25*x, 26*y);
			}
		}

		
		
	}

	private Image imagen;
	//SETTER
	/*public void  ArribaAbajo() {
		
		String pedir,pedir1;
		int a, b;
		
		pedir = JOptionPane.showInputDialog("Bolas bajo");
		a =  Integer.parseInt(pedir);
		pedir1 = JOptionPane.showInputDialog("Bolas derechas");
		b =  Integer.parseInt(pedir1);
		
	}
*/
}
