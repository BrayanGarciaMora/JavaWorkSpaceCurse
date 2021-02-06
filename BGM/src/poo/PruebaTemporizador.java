package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DameLaHora oyente = new DameLaHora();
		Timer miTemporizador = new Timer(1000, oyente);
		miTemporizador.restart();

		JOptionPane.showMessageDialog(null, "Pulsa Aceptar par detener"); // pertenece al paquete javaswing
		System.exit(0);
 
	}

}

class DameLaHora implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();

		System.out.println("Hora cada 5 segundo" + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}