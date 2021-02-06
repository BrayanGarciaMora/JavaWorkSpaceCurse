package poo;
import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Toyota = new Coche();// ESTO ES UNA INSTANCIA DE CLASE, ES UN EJEMPLAR   
		Furgoneta  mifurgoneta = new Furgoneta(7,580); 
		
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Verde");
		// ESTOS SON METODOS HEREDADOS DE LA CALSE COCHE. ESTO SE CONOCE COMO REUTILIZACION DEL CODIGO.
		mifurgoneta.establece_color("Morado"); 
		mifurgoneta.configura_asietos("si");
		mifurgoneta.confiigura_climatizador("si");
		
		
		System.out.println(micoche1.devolver_datos_generales() + " " + micoche1.devolver_color());
		System.out.println(mifurgoneta.devolver_datos_generales() + mifurgoneta.devolver_color() +"\n"+ mifurgoneta.devolverDatoFurgoneta());
		
		 
		
		
		
		
		
		
		
		
		
		
		
/*
C		System.out.println(Toyota.devolver_datos_generales());
O		Toyota.establece_color(JOptionPane.showInputDialog("Cual es el color del cohe: " ));//PASANDO LOS PARAMETROS PARA LOS METODOS SETTE
M		System.out.println(Toyota.devolver_color());
E		Toyota.configura_asietos(JOptionPane.showInputDialog("Tiene asistos de cuero? "));//PASANDO LOS PARAMETROS PARA LOS METODOS SETTE
N		System.out.println(Toyota.devolver_asientos_cueros());
T		Toyota.confiigura_climatizador(JOptionPane.showInputDialog("Tiene climatizador? "));//PASANDO LOS PARAMETROS PARA LOS METODOS SETTE
A		System.out.println(Toyota.devolver_climatizador());
R		
I		System.out.println(Toyota.devolver_peso_cohe());
O		System.out.println("El precio del coche es " +  Toyota.devolver_precio_cohe());
*/
			}

}


//System.out.println(" Todos sabesmo que un coche tiene " + Toyota.ruedas + " ruedas ");
		//System.out.println(" Todos sabesmo que un coche tiene unas dimeciones, por ejemplo " +Toyota.largo + " centimetro de largo ");
		//System.out.println(Toyota.DelvoverLargo());