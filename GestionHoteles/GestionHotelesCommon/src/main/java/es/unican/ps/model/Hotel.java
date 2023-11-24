package es.unican.ps.model;


import java.util.List;

import lombok.*;

@Getter
public class Hotel {
	
	
	private long idHotel;
	

	private String nombre;
	private final String direccion;
	private final String localidad;
	private List<TipoHabitacion> habitaciones ;
	
	
	public Hotel(long idHotel, String nombre, String direccion, String localidad) {
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
	}
	
	

	public long getIdHotel() {
		return idHotel;
	}	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TipoHabitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<TipoHabitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getLocalidad() {
		return localidad;
	}
	
}
