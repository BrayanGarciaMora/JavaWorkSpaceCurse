package poo;
//HACIENDO USO DE LA ERENCIA
public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta (int plazas_extra, int capasidad_carga) {
		
		super();// PARA LLAMAR AL COSTRUCTOR DE LA CLASE PADRE 
		
		this.capacidad_carga = capasidad_carga;
		this.plazas_extra	= plazas_extra;
	}
	
	public String devolverDatoFurgoneta() {
		
		return "La capasidad de carga es: " + capacidad_carga + "La cantidad de plaza de la furgoneta es: " + plazas_extra;
	}

	
}
