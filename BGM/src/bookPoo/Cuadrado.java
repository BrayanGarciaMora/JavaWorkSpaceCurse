package bookPoo;

public class Cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado objeto = new Cuadrado();
		objeto.menu(2);
	}

//CRACION DE UN ATRIBUTO PRIVADO
	private int atributo;

	private int valores1;
	private int perimetro;
	private int area;
	private int valores2;
	private static int valores3;
	private int opciones;

	// METODOS CONSTRUCTOR SIN PARAMETROS
	public Cuadrado() {
		// TODO Auto-generated constructor stub
		valores3 =4;
	}

	// METODO COSTRUCTOR QUE RESIVE DOS PARAMETROS
	public Cuadrado(int parametroUno, double parametroDos) {

	}

	public void setEstablecerValor1(int valores1) {
		this.valores1 = valores1;

	}

	public void setEstablecerValor2(int valores2) {
		this.valores2 = valores2;
	}

	public void menu(int opciones) {

		System.out.println("Opcione 1 Area \n Opcion 2 Perimetro");
		this.opciones = opciones;

	}

	public int calculos() {

		if (opciones == 2) {
			area = valores1 * valores1;

			return area;
		} else {
			perimetro = valores2 * valores3;
			return perimetro;
		}
	}

}
