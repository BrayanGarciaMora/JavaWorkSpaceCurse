package peleaPokemon;

public class SucesionFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 0;
		int c = 1;
		int sucesion;
		for (int a = 1; a <= 10; a++) {
			sucesion = b + c;
			b = c;
			c = sucesion;
			System.out.println(sucesion);

		}

	}
}
