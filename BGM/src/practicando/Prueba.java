package practicando;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String fuentes = JOptionPane.showInputDialog(" Que tipo de fuentes");
		boolean estafuente = false;
		String[] TiposFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (String Tiposfuentes : TiposFuentes) {
			System.out.println(Tiposfuentes);
//			if (Tiposfuentes.equalsIgnoreCase(fuentes)) {
//				estafuente= true;
//			}
//			
			 
		}
//		if (estafuente) {
//			
//			System.out.println("Claro que esta la fuente");
//		}
//		else {
//			System.out.print("TT_TT no esta la fuente");
//		}
	}

}
