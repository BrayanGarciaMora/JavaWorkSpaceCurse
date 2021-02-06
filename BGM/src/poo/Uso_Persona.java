package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREANDO UN ARREGLO (ARRAY) PERSONA
		Persona[] persona1 = new Persona[2];
		
		persona1[0] = new Empleado2("Juanito", 20000, 1995, 12,23);
		persona1[1] = new Alumno("Colico", "Ingenieria" );
		
		
		for (Persona p: persona1) {
			
			
			System.out.println(p.devolverNombre() + ", "+ p.devolverDescripcion());
	//		System.out.println();
			
		}

	}

}


 abstract  class Persona{
	
	 public Persona(String nom) {
		 
		 nombre = nom;
		 
	 }
	 
	 public String devolverNombre() {//METODO GETTER
		 
		 return " El nombre es: " + nombre;
	 }
	 
	 public abstract String devolverDescripcion();
	 
	 private String nombre;
}

class Empleado2 extends Persona {
	
	//CREANDO EL COSTRUCTOR METODO
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
	super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
		altaContrato = calendario.getTime()	;
		
		
		Id = Idsiguiente;
		++Idsiguiente;
		
	}
	
	public  String devolverDescripcion(){
		
		return "Este empleado tiene un Id: " + Id + " Con un sueldo de: " + sueldo;  
	}
	
	//METODO GETTER PARA EL SUELDO
	public double devolveSueldo() {
		
		return sueldo;
	}
	
	//METODO GETTER PARA FECHA DE CONTRATO
	public Date devolveFecha() {
		
		return altaContrato;
	}
	//METODO SETTER  
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo* porcentaje/100;
		sueldo+= aumento;
	}
	
	

	private double sueldo;
	private Date altaContrato;
	private static int Idsiguiente = 1;
	private int Id;
	

	
}

class Alumno extends Persona{//CLASE ALUMNOS

	public Alumno(String nom, String car) {// METODO COSTRUCTOR
		
		super (nom);
		carrera = car;
	}
	public  String devolverDescripcion(){
		
		return "El alumno pertenece a la carrera de: " +carrera;  
	}
	
	private String carrera;
}









