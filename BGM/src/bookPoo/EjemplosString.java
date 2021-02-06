package bookPoo;

public class EjemplosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;
		String cadena = "Hola mundo";
		System.out.println("Lacadena tiene " + cadena.length() + " caracteres");
		for (int a = 0; a < cadena.length(); ++a) {
			caracter = cadena.charAt(a);
			System.out.println("La posicion " + a + " Tiene el caracter " + caracter);
		}

	}

}
