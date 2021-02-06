package graficos;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "Holagmail.com";
		boolean comprovacion = false;
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i)== '@') {
				comprovacion = true;
			}

		}
		if (comprovacion) {
			System.out.println("correo valido");
		}else {
			System.out.println("correo invalido");
		}
	}

}
