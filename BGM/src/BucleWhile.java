import java.util.*;

import javax.swing.JOptionPane;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = "1234";
		String valor1 = "";
		while (valor.equals(valor1) == false) { // F & F = V
			valor1 = JOptionPane.showInputDialog(valor1);

			if (valor.equals(valor1) == false) {
				System.out.println("Usuario Inconrrecto");

			}

		}
		System.out.println("Usuario Correcto");
	}

}
