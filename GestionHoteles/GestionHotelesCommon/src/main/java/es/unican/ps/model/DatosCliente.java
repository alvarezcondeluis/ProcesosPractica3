package es.unican.ps.model;


public class DatosCliente {
	
	
	
	private final String dni;
	private final String nombre;
	private final String email;
	
	
	public DatosCliente(String dni, String nombre, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
	}



	public String getDni() {
		return dni;
	}



	public String getNombre() {
		return nombre;
	}



	public String getEmail() {
		return email;
	}
	
}
