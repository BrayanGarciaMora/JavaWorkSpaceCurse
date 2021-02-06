package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;

import javax.swing.*;

public class OtraForma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoVentana1 marco1 = new MarcoVentana1();
		marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MarcoVentana1 marco2 = new MarcoVentana1();

		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		marco1.setTitle("Marco numero 1");
		marco1.setBounds(100,200,400,300);
		
		marco2.setTitle("Marco numero 2");
		marco2.setBounds(700,200,400,300);
	}

}

class MarcoVentana1 extends JFrame {

	public MarcoVentana1() {

		// setTitle("Respondiendo");
		// setBounds(700, 300, 500, 300);
		setVisible(true);

//		M_Ventana oyenteVentana = new M_Ventana();

//		addWindowListener(oyenteVentana); 
		
		addWindowListener(new M_Ventana1());
	}

}

class M_Ventana1 extends WindowAdapter {
	// DESCLARAR TODOS LOS METODOS QUE SON OBLIGATORIO AUNAQUE NO SE UTILEICEN TODOS
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println(" Ventana minimizada");
		
	}


}

