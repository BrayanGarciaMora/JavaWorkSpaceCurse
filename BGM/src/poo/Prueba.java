package poo;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Pedro");
		Empleados trabajador2 = new Empleados("paco");
		Empleados trabajador3 = new Empleados("Maria");
		Empleados trabajador4 = new Empleados("Brandon");
		Empleados trabajador5 = new Empleados("Virginia");
		Empleados trabajador6 = new Empleados("Aurora");
		Empleados trabajador7 = new Empleados("Estefani");
		Empleados trabajador8 = new Empleados("Anuenl");
		Empleados trabajador9 = new Empleados("Omar");
		Empleados trabajador10 = new Empleados("Ian");
		
		trabajador1.cambiaSeccion("Contabilidad");
		trabajador5.cambiaSeccion("Vendedor");
		trabajador4.cambiaSeccion("Cocinero");
		trabajador7.cambiaSeccion("Digitador");
		trabajador9.cambiaSeccion("Programador");
		trabajador3.cambiaSeccion("Gerente");
		
		System.out.println(trabajador1.devolverDatos());
		System.out.println(trabajador2.devolverDatos());
		System.out.println(trabajador3.devolverDatos());
		System.out.println(trabajador4.devolverDatos());
		System.out.println(trabajador5.devolverDatos());
		System.out.println(trabajador6.devolverDatos());
		System.out.println(trabajador7.devolverDatos());
		System.out.println(trabajador8.devolverDatos());
		System.out.println(trabajador9.devolverDatos());
		System.out.println(trabajador10.devolverDatos());
		System.out.println(Empleados.devolverIdsiguiente());
	}

}


class Empleados{
	
	private final String nombre;
	private String seccion;
	private int Id;
	public static int IdSiguiete = 1;
	
	
	
	
	public Empleados (String nom) { //METOSD CONSTRUCTOR 
		nombre = nom;
		
		seccion = "Administracion";
		 Id = IdSiguiete;
		 
		 IdSiguiete++;   
		
	}
	
/*	public void estableceNombre(String nombre) { //setter
		
		this.nombre = nombre;
	}*/
	
	public void cambiaSeccion(String seccion) { //setter
		this.seccion = seccion;
	  		
		
	}
	
	public String devolverDatos() {//getter   
		
		return "El nombre es: " + nombre + " la seccion es : " + seccion + " El Id es " + Id;
	}
	
	public static String devolverIdsiguiente(){
		
		return "El Id siguiente es: " + IdSiguiete;
		
	}
	
	
	
	
}