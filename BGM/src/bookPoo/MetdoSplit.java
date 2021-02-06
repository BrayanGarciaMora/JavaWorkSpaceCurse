package bookPoo;

public class MetdoSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Hola planeta tierra, no estan solos siempre hemos estados con ustedes";
		String cadenas[] = cadena.split(" ");
		for (int a = 0; a < cadenas.length; a++) {
			System.out.println("La cadena " + a + " es " + cadenas[a]);
		}

	}

}
