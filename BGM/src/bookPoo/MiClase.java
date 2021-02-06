package bookPoo;

public class MiClase {
	public static int miValor;

	// DEFINICION DE ATRIBUTOS
	private int atributo1;
	private int atributo2;
	public int asolas;

	// DEFINICION DE METDO CONSTRUCTOR CLASIFICACION 1
	public MiClase() {
		// ASIGNAR VALOR A LAS DEFINICION DE LOS ATRIBUTOS
		this.atributo1 = 0;
		this.atributo2 = 2;

	}

	// METODO CONSULTOR CLASIFICACION 2
	public String getAtributo1() {

		return "El valor del atributo1 es: " + this.atributo1;
	}

	public String getAtributo2() {

		return "El valor del atributo2 es: " + this.atributo2;
	}

	// METODO MODIFICADOR CLASIFICACION 3

	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}

	// METODO ANALIZADOR CLASIFICAION 4
	public String calcularMayor() {

		if (this.atributo1 > this.atributo2) {
			return " Atributo1 es mayor que el atributo2 " + this.atributo1 + " > " + this.atributo2;
		} else if (this.atributo1 == this.atributo2) {
			return "Ambos son iguales " + this.atributo2 + " = " + this.atributo1;
		} else {
			return "Atributo1  es menor que el atributo2 " + this.atributo1 + " < " + this.atributo2;
		}
	}

	public static String factorial(long n) {
		long fact = 1;
		for (int i = 1; i < n; i++) {
			fact *= i;

		}

		return fact + "\n Elvalor de miValor es: " + miValor;

	}

}
