package bookPoo;

public class PricipalInicioPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiClase ojjeto = new MiClase();

		MiClase objeto1 = new MiClase();
		objeto1.miValor = 5;

		System.out.println(objeto1.factorial(7));

		// USO DE METODOS MOFIFICADORES
		objeto1.setAtributo1(7);
		objeto1.setAtributo2(6);

		// USO DE METODOS CONSULTORES
		System.out.println(objeto1.getAtributo1());
		System.out.println(objeto1.getAtributo2());
		System.out.println(objeto1.calcularMayor());

	}

}
