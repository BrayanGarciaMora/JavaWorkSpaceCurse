package bookPoo;

import java.util.*;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evaluar;

		Triangulo Objeto = new Triangulo();
		Objeto.menu();
		Scanner datoEntrada = new Scanner(System.in);
		System.out.println("Eliaja la opcion");
		evaluar = datoEntrada.nextInt();

		if (evaluar == 1) {
			System.out.println("Has elegido calcular el area del triangulo");
			Objeto.pedirBase();
			Objeto.pedirHaltura();
			System.out.println(Objeto.consultores(evaluar));

		} else if (evaluar == 2) {
			System.out.println("Has elegido calcular el perimetro del triangulo");
			Objeto.pedirLados();
			System.out.println(Objeto.consultores(evaluar));
		}

	}

	private double  base;
	private double  haltura;
	private double  area;
	private double  perimetro;
	private double  ladoA;
	private double  ladoB;
	private double  ladoC;
	Scanner datoEntrada = new Scanner(System.in);

	public Triangulo() {

	}

	// METODO ESTABLECEDOR O SETTER
	public void menu() {
		System.out.println("Opcion 1: calcular el area \n Opcion 2 Calcular el perimetro del triangulo");
	}

	public void pedirBase() {
		System.out.println("Digite la base: ");

		this.base = datoEntrada.nextInt();

	}

	public void pedirHaltura() {
		System.out.println("Digite la altura: ");
		this.haltura = datoEntrada.nextInt();
	}

	public void pedirLados() {
		System.out.println("Digite el lado A ");
		ladoA = datoEntrada.nextInt();
		System.out.println("Digite el lado B ");
		ladoB = datoEntrada.nextInt();
		System.out.println("Digite el lado C ");
		ladoC = datoEntrada.nextInt();
	}

	// METODO CONSULTOR O GETTER
	public String consultores(int opcion) {

		if (opcion == 1) {

			area = (base * haltura) / 2;
			return "El area del triangulo es: " + area;

		} else if (opcion == 2) {
			perimetro = ladoA + ladoB + ladoC;
			return "El Perimetro es: " + perimetro;
		} else {
			return "Parametro invalodo!!";
		}

	}

}
