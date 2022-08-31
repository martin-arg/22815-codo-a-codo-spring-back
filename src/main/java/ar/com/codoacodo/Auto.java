package ar.com.codoacodo;

// los nombres de las clases la primer letra es mayuscula
public class Auto {
	/*
	 atributos
	 */
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	//constructor/es
	
	// constructor por defecto
	Auto() {		
		
	}
	
	//metodos
	void encender() {
		encendido = false;
	}
	
	void apagar() {
		
	}
	
	void acelerar() {
		
	}
	
	void frenar() {
		
	}
	
	void mostrarInfo() {
		System.out.println("El auto esta " + encendido);
		
	}
	

}
