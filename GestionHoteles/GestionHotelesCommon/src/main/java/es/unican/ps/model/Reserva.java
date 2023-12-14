package es.unican.ps.model;

import java.util.Date;  
import java.util.Map;
import java.util.HashMap;

public class Reserva {
	
	private long id;
	private Date fechaDeEntrada;
	private Date fechaSalida;
	private double importe;
	private Hotel hotel;
	private Map<TipoHabitacion, Integer> habitacionesReservadas;
	private final DatosCliente cliente;
	
	public Reserva(long id, Date fechaDeEntrada, Date fechaSalida, Hotel hotel, DatosCliente cliente) {
		this.hotel = hotel;
		this.id = id;
		this.fechaDeEntrada = fechaDeEntrada;
		this.fechaSalida = fechaSalida;
		this.importe = 0;
		this.habitacionesReservadas = new HashMap<TipoHabitacion, Integer>();
		this.cliente = cliente;
	}

	public void anhadeHabitaciones(TipoHabitacion t, int numero) {
		this.habitacionesReservadas.put(t, numero);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaDeEntrada() {
		return fechaDeEntrada;
	}

	public void setFechaDeEntrada(Date fechaDeEntrada) {
		this.fechaDeEntrada = fechaDeEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getImporte() {
		return this.importe;
	}
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public Map<TipoHabitacion, Integer> getHabitaciones(){
		return habitacionesReservadas;
	}

	public DatosCliente getCliente() {
		return cliente;
	}
	
}
