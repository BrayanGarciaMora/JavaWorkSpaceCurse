import java.util.*;

import javax.swing.JOptionPane;

public class BucleWhileAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int) (Math.random() * 100);
		
		Scanner datoEntrad = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		System.out.println(aleatorio);
		while (numero != aleatorio ) {
			System.out.println("nuemro de intentos :" + intentos++);
			System.out.println("Introduzca un numero : ");
			numero = datoEntrad.nextInt();
			if (numero > aleatorio) {
				System.out.println("El nuemero es muy Alto");

			} else if (numero < aleatorio) {
				System.out.println("El nuemero es muy Bajo");
			}
			
		}
		System.out.println("Haz acertado en " +  + intentos +" Intentos");
	}

}
