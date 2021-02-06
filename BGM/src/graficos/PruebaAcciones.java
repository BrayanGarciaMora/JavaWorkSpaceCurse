package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion marco = new MarcoAccion();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoAccion extends JFrame {
	public MarcoAccion() {

		setTitle("Prueba Accion");
		setBounds(600, 350, 600, 300);

		PanelAccion lamina = new PanelAccion();// AQIO ESTOY INSTANCIANDO LA LAMINA
		add(lamina); // CON ESTO AGREGO LA LAMINA AL MARCO
	}
}

class PanelAccion extends JPanel {// ESTO ES PARA LA LAMINA

	public PanelAccion() {

		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/img.gif"), Color.YELLOW);
		AccionColor accionAzul = new AccionColor("azul", new ImageIcon("src/graficos/img.gif"), Color.blue);
		AccionColor accionRojo = new AccionColor("rojo", new ImageIcon("src/graficos/img.gif"), Color.red);

//FORMA UNA DE COMO HACER QUE UN BOTON RESIVA UN PARAMETRO DE TIPO OBJETO

//	JButton accionA = new JButton(accionAmarillo);
//	add(accionA);

//FORMA DOS Y MAS CORTA DE HACER USO DE UN EVENTO DENTRO DE UN BOTON
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));

//		JButton botonAmarrillo = new JButton("Amarrillo"); // CREANDO BOTONES DENTRO DE LA LAMINA
//		JButton botonRojo = new JButton("Rojo");
//		JButton botonAzul = new JButton("Azul");
//		add(botonAmarrillo); // CON ESTA SINTAXIS PURDO AGREGAR LOS BOTONOES A LA LAMINA
//		add(botonRojo);
//		add(botonAzul);
	}

	class AccionColor extends AbstractAction {
		public AccionColor(String nombre, Icon icono, Color colorBoton) {

			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Este es el boton de color " + nombre);
			putValue("color_de_fondo", colorBoton);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stubde
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
		}

	}
}
