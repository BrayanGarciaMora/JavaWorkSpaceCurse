package poo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

//import javax.swing.JOptionPane;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ESTO ES UNA FORMA DE HACERLO
		/*
		 * Empleado empleado1 = new
		 * Empleado(JOptionPane.showInputDialog("Como se llama el empleado 1 "),10000,
		 * 2000,2,15); Empleado empleado2 = new
		 * Empleado(JOptionPane.showInputDialog("Como se llama el empleado 2 "),20000,
		 * 1998,4,18); Empleado empleado3 = new
		 * Empleado(JOptionPane.showInputDialog("Como se llama el empleado 3 "),15000,
		 * 1996,8,19); double carct =
		 * Integer.parseInt(JOptionPane.showInputDialog("Cula es el porcentage? "));
		 * empleado1.subeSueldo(carct); double carct2 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Cula es el porcentage? "));
		 * empleado2.subeSueldo(carct); double carct3 =
		 * Integer.parseInt(JOptionPane.showInputDialog("Cula es el porcentage? "));
		 * empleado3.subeSueldo(carct); System.out.println("nombre empleado 1: " +
		 * empleado1.devolveNombre() +" Sueldo empleado 1: " + empleado1.devolveSueldo()
		 * + " sdddfa" + "Fecah de alta " + empleado1.devolveFecha());
		 * 
		 * System.out.println("nombre empleado 2: " + empleado2.devolveNombre()
		 * +" Sueldo empleado 2: " + empleado2.devolveSueldo() + " Fecah de alta " +
		 * empleado2.devolveFecha());
		 * 
		 * System.out.println("nombre empleado 3: " + empleado3.devolveNombre()
		 * +" Sueldo empleado 3: " + empleado3.devolveSueldo() + " Fecah de alta " +
		 * empleado3.devolveFecha());
		 * 
		 */

		Jefatura jefe_RRHH = new Jefatura("Brayan ", 55000, 1996, 11, 11);
		jefe_RRHH.estableceIncentivo(2000);
		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Aurora almotes", 20000, 1997, 0, 30);
		misEmpleados[1] = new Empleado("Toribio Mora", 5000, 1997, 9, 30);
		misEmpleados[2] = new Empleado("Dago flores", 7000, 1997, 9, 30);
		misEmpleados[3] = new Empleado("salina  ");
		misEmpleados[4] = jefe_RRHH; // POLIMORFISMO EN ACCION. PRINCIPIO DE SUSTITUCION
		misEmpleados[5] = new Jefatura("Sonia", 95000, 2020, 6, 15);
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];

		jefa_Finanzas.estableceIncentivo(55000);

		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		System.out.println(
				"El jefe " + jefa_Finanzas.devolveNombre() + " Su bonus es: " + jefa_Finanzas.establece_bonus(500));

		System.out.println(" El empleado " + misEmpleados[2].devolveNombre() + " Tiene un bonus de "
				+ misEmpleados[2].establece_bonus(500));
		// ESTA ES OTRA FORMA DE HACERLO
		/*
		 * for (int i =0; i<3; i++) { misEmpleados[i].subeSueldo(7); }
		 * 
		 * for (int i = 0;i<3; i++) {
		 * 
		 * System.out.println("Nombre " + misEmpleados[i].devolveNombre() +
		 * "sueldo empleado " + misEmpleados[i].devolveSueldo() + "Fecha de alta " +
		 * misEmpleados[i].devolveFecha()); }
		 */
		// BUCLE FOR MEJORADO

		for (Empleado a : misEmpleados) {

			a.subeSueldo(5);
		}
		Arrays.sort(misEmpleados);

		for (Empleado a : misEmpleados) {

			System.out.println("Nombre " + a.devolveNombre() + "sueldo empleado " + a.devolveSueldo()
					+ " Fecha de alta " + a.devolveFecha());

		}
	}

}

class Empleado implements Comparable, Trabajadores {

	// CREANDO EL COSTRUCTOR METODObb
	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();

		Id = Idsiguiente;
		Idsiguiente++;

	}

	// SOBRE CARGA DE COSTRUCTORES

	public Empleado(String nom) {

		this(nom, 4000, 2000, 1, 23);

	}

	// METODO GETTER PARA NOMBRE DEL EMPLEADO
	public String devolveNombre() {

		return nombre + " su id es " + " " + Id + " ";
	}

	// METODO GETTER PARA EL SUELDO
	public double devolveSueldo() {

		return sueldo;
	}

	// METODO GETTER PARA FECHA DE CONTRATO
	public Date devolveFecha() {

		return altaContrato;
	}

	// METODO SETTER
	public void subeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	public int compareTo(Object miObjeto) {

//		esto es una refundicon de objetos
		Empleado otroEmpleado = (Empleado) miObjeto;

		if (this.Id < otroEmpleado.Id) {
			return -1;

		}
		if (this.Id > otroEmpleado.Id) {
			return 1;
		}
		return 0;
	}

	public double establece_bonus(double gratificacion) {
		double prima = 2500;
		return Trabajadores.bouns_base + gratificacion + prima;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int Idsiguiente = 1;
	private int Id;

}

//ESTO ES OTRA CLASE 
class Jefatura extends Empleado implements Jefes {
	// METODO CONSTRUCTOR
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);
	}

	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}

	public double establece_bonus(double gratificacion) {

		double prima = 2000;
		return Trabajadores.bouns_base + gratificacion + prima;
	}

	public void estableceIncentivo(double b) {// SETTER

		incentivo = b;

	}

	public double devolveSueldo() {// GETTER

		double sueldoJefe = super.devolveSueldo();

		return sueldoJefe + incentivo;
	}

	private double incentivo;
}

class Director extends Jefatura {

	public Director(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);
	}

}
