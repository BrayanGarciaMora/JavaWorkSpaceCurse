package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OtrafoeventosBotones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotonesA mimarco = new MarcoBotonesA();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotonesA extends JFrame {

	public MarcoBotonesA() {

		setTitle("Marcos y Botones");
		setBounds(700, 300, 500, 300);

		LaminaBotonesA milamina = new LaminaBotonesA();

		add(milamina);
	}

}

class LaminaBotonesA extends JPanel {

	//CREANDO BOTONES
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	JButton botonAmari = new JButton("Amarillo");
	JButton botonVerde = new JButton("verde");
	JButton botonMagenta = new JButton("Morado");
	JButton botonNegro = new JButton("Negro");
	JButton botonMamel = new JButton("Mamel");
	JButton botonBlanco = new JButton("Blanco");
	JButton botonAzul1 = new JButton("Azul");
	JButton botonRojo2 = new JButton("Rojo");
	JButton botonAmari4 = new JButton("Amarillo");
	JButton botonVerde3 = new JButton("verde");
	JButton botonMagenta5 = new JButton("Morado");
	JButton botonNegro6 = new JButton("Negro");
	JButton botonMamel7 = new JButton("Mamel");
	JButton botonBlanco8 = new JButton("Blanco");


	public LaminaBotonesA() {//METODO COSTRUTOR
		add(botonAzul);
		add(botonRojo);
		add(botonAmari);
		add(botonVerde);
		add(botonMagenta);
		add(botonNegro);
		add(botonMamel);
		add(botonBlanco);
		add(botonAzul1);
		add(botonRojo2);
		add(botonAmari4);
		add(botonVerde3);
		add(botonMagenta5);
		add(botonNegro6);
		add(botonMamel7);
		add(botonBlanco8);

		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);

		ColorFondo Amari = new ColorFondo(Color.YELLOW);
		ColorFondo Verde = new ColorFondo(Color.GREEN);

		ColorFondo Magenta = new ColorFondo(Color.MAGENTA);
		ColorFondo Negro = new ColorFondo(Color.BLACK);

		ColorFondo Mamel = new ColorFondo(Color.ORANGE);
		ColorFondo Blanco = new ColorFondo(Color.WHITE);

		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmari.addActionListener(Amari);
		botonVerde.addActionListener(Verde);
		botonMagenta.addActionListener(Magenta);
		botonNegro.addActionListener(Negro);
		botonMamel.addActionListener(Mamel);
		botonBlanco.addActionListener(Blanco);

	}

	private class ColorFondo implements ActionListener {

		public ColorFondo(Color c) {
			ColorDeFondo = c;
		}

		public void actionPerformed(ActionEvent e) {
			setBackground(ColorDeFondo);
		}

		private Color ColorDeFondo;
	}

}
