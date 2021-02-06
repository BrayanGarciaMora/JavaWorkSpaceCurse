package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class CreadoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado marco = new MarcoCentrado();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		marco.setTitle("Marco centrado");
	}

}

class MarcoCentrado extends JFrame {

	public MarcoCentrado() {

		Toolkit mipantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = mipantalla.getScreenSize();

		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;

		setSize(anchoPantalla / 2, alturaPantalla / 2);
		setLocation(anchoPantalla / 4, alturaPantalla / 4);

		Image miIcono = mipantalla.getImage("src/graficos/Bola.png");
		setIconImage(miIcono);
	}

}