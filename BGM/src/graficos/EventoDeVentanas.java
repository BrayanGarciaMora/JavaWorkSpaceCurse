package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;

import javax.swing.*;

public class EventoDeVentanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoVentana marco1 = new MarcoVentana();
		marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MarcoVentana marco2 = new MarcoVentana();

		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		marco1.setTitle("Marco numero 1");
		marco1.setBounds(100,200,400,300);
		
		marco2.setTitle("Marco numero 2");
		marco2.setBounds(700,200,400,300);
	}

}

class MarcoVentana extends JFrame {

	public MarcoVentana() {

		// setTitle("Respondiendo");
		// setBounds(700, 300, 500, 300);
		setVisible(true);

		M_Ventana oyenteVentana = new M_Ventana();

		addWindowListener(oyenteVentana);
	}

}

class M_Ventana implements WindowListener {
	// DESCLARAR TODOS LOS METODOS QUE SON OBLIGATORIO AUNAQUE NO SE UTILEICEN TODOS
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}

	public void windowClosed(WindowEvent e) {
		
		System.out.println("este marco ha sido cerrada"); 
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("Ventana Cerrandoce");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("En segundo plano");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana Restaurada");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Minimizada");
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana Abierta");
	}

}

