 package poo;

public class Coche { //ESTO ES UNA CLASE	
	private int ruedas; //AL PONER PRIVATE ESTOY ENCAPSULANDO, ESTA SOLO TE PERMITE MODIFICAR UN VALOR DESE DEICHA CLASE
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String valor_falso;
	private String color;
	private int peso_total;
	private boolean asientos_cueros, climatizador;
	
	
	
	public Coche(){ // ESTO ES UN OBJETO, QUE TAMBIEN ES UN METODO CONSTRUCTOR

		 
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
	}
	
	public String devolver_datos_generales  () {// UNICO METODO PARA LOS DATOS GENERALES
		
		return  "La plataforma del veiculo tiene " + ruedas + " ruedas" + " mide " +
				largo / 1000 + " metros con un ancho de  " + ancho + 
				" cm y con un  peso de plataforma de " +  peso_plataforma + " KG ";
		
	}
	
	public String delvover_largo() {//METODO GETTER-DEVUELVE UN VALOR
		
		
		return "El largo del coche es: " + largo;
	}
	//-------------------------------------------------------------------------------------------------------
	public void establece_color(String color_coche) {//ESTE ES UN METODO SETTER- ESTABLESE UN VALOR,MODIFICA EL VALOR
		
		color = color_coche;
	}
	
	public String devolver_color() { //METODO GETTER
		
		return "El color del coche es: " + color;
	}
	//---------------------------------------------------------------------------------------------------------
	
	public void configura_asietos(String asientos_cueros) {
		
		if (asientos_cueros.equalsIgnoreCase("si")) {
			this.asientos_cueros = true;
		}

		else if (asientos_cueros.equalsIgnoreCase("no")) {
			this.asientos_cueros = false;
		}
		else {
			  valor_falso = "parametro invalido";
			
		}
		
		
	}
	
	public String devolver_asientos_cueros() {
		
		if ( asientos_cueros == true) {
			return "El coche tiene asientos de cuero";
		}
		
		if ( asientos_cueros == false)  {
			
			return "El coche  tiene asientos de serie";
		}else {
			return valor_falso;
		}
		
	}
	//---------------------------------------------------------------------------------------
	 public void confiigura_climatizador(String climatizador) {
		 
		 if (climatizador.equalsIgnoreCase("si")) {
			 
			 this.climatizador = true;
		 }
		 if (climatizador.equalsIgnoreCase("no")) {
			 this.climatizador = true;
		 }
		 else {
			  valor_falso = "parametro invalido";
				
		 }
	 }
	 
	 public String devolver_climatizador() {
		 
		 if (climatizador == true) {
			  
			 return "Incorpora climatizador";
		 }
		 if(climatizador == true) {
			 return "No lleva aire acondicionado";
		 }
		 else {
			 return valor_falso;
		 }
	 }
	   
	//------------------------------------------------------------------------------------------------------------------
	 
	 public String devolver_peso_cohe() {//METODO SETTER AND GETTER A LA VEZ
		 
		 int peso_carroceria = 500;
		 
		 peso_total = peso_plataforma + peso_carroceria;
		 
		 
		 if (asientos_cueros == true) {
			 
			 peso_total += 50;
			  
		 }
		 if (climatizador == true) {
			 
			 peso_total += 20;
			  
		 }
		 
		 return "El peso total del coche es: " + peso_total;
	 }
	    
	 public int devolver_precio_cohe() {
		 int precio_final = 10000;
		 
		 if (asientos_cueros == true) {
			 precio_final += 2000;
		 }
		 if (climatizador == true) {
			 
			 precio_final += 1500;
		 }
		 	return precio_final;
	 }
	 
	 
}























