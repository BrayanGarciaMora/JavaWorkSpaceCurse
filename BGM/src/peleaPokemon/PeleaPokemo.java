package peleaPokemon;

import javax.swing.JOptionPane;

public class PeleaPokemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ataque;
		double ataque1 = 35;
		double ataque2 = 30;
		double ataque3 = 20;
		double vida1 = 100;
		int contador = 0;
		while (vida1 > 0) {

			System.out.println("Ataques: \n 1 Relampago \n 2 Tormenta de arena \n 3 Cuchillas ");

			ataque = JOptionPane.showInputDialog("Que ataques quieres utilizar? 1-2 o 3");
			int ataque0 = Integer.parseInt(ataque);
			switch (ataque0) {
			case 1:
				System.out.println("Ataque 1 Relampago 35% daño");
				vida1 -= ataque1;

				if (vida1 > 0) {
					System.out.println("Tu vida se redujo a: " + vida1 + "%");
				} else {
					vida1 = 0;
					System.out.println("Game ouver " + vida1 + "%");
				}

				break;
			case 2:
				System.out.println("Ataque 2 Tormenta de arena 30% daño");
				vida1 = vida1 - ataque2;
				contador++;
				if (contador >2) {
				vida1 =	vida1 - 15;
					System.out.println("Ataque critico");
				}
				if (vida1 > 0) {

					System.out.println("Tu vida se redujo a: " + vida1 + "%" + contador);
				} else {
					vida1 = 0;
					System.out.println("Game ouver " + vida1 + "%");
				}
				break;
			case 3:
				System.out.println("Ataque 3 Cuchillas 20% daño");
				vida1 = vida1 - ataque3;
				if (vida1 > 0) {
					System.out.println("Tu vida se redujo a: " + vida1 + "%");
				} else {
					vida1 = 0;
					System.out.println("Fin del Juego " + vida1 + "%");
				}
				break;
			default:
				System.out.println(" Ataque no valido");
				break;

			}

		}

	}

}
