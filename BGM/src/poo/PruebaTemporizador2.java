package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj miReloj = new Reloj(3000, true);
		miReloj.enMarcha();

		JOptionPane.showMessageDialog(null, "Aceptar para terminiar");
		System.exit(0);

	}
}

class Reloj {

	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;

	}

	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();

		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}

	private  class DameLaHora2 implements ActionListener {
		public void actionPerformed (ActionEvent a) {
			Date ahora = new Date();
			
			System.out.println("La hora cada 3 segundo" + ahora);
			if (sonido == true) {
				
				Toolkit.getDefaultToolkit().beep();
			}
			else {
				System.out.println("Sin sonido");
			}
			
		}
	

	}

	private int intervalo;
	boolean sonido;
}
