package bookPoo;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaciones objeto = new Operaciones();
		objeto.setter(5);
		System.out.println("El factorial de: " + objeto.parametro + " = " + factorial());
		System.out.println(objeto.primo());
	}

	private static int parametro;
	private static int factorial;
	private int a;

	public Operaciones() {
		factorial = 1;
	}

	public void setter(int parametro) {
		this.parametro = parametro;
	}

	public static int factorial() {

		for (int i = 1; i <= parametro; i++) {

			factorial *= i;

		}

		return factorial;
	}

	public static String primo() {
		int i;
		for (i = 1; i <= parametro; i++) {

			if (i % 2 != 0) {
				System.out.print(i);
				System.out.print("-");
			}
			

		}
		return " son los numeros primos de 1 al " + i;
	}

}
