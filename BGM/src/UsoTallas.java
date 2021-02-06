import java.util.Scanner;

public class UsoTallas {

//	enum talla {
//		MINI, MEDIANO, GRANDE, MUY_GRANDE
//	};

	enum Talla {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRADE("XL");

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;

		}

		public String getAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
//talla s = talla.MINI;
//talla m = talla.MEDIANO;
//talla l = talla.GRANDE;
//talla xl = talla.MUY_GRANDE;
//System.out.println(m);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Intoduce una talla");

		String entrada_datos = entrada.nextLine().toUpperCase();
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		 System.out.println("Talla = "+ la_talla);
		 System.out.println("Abreviatura = " + la_talla.abreviatura);
	}

}
