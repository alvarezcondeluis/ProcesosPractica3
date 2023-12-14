package es.unican.ps.model;

import java.io.Serializable;
import java.util.Date;  
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.HashMap;

@SuppressWarnings("serial")
@Entity
@Table(name = "Reservas")
public class Reserva implements Serializable {
	
	@Id
	private long id;
	
	private Date fechaDeEntrada;
	private Date fechaSalida;
	private double importe;
	private Hotel hotel;
	private Map<TipoHabitacion, Integer> habitacionesReservadas;
	private DatosCliente cliente;
	
	public Reserva() {
		
	}
	
	public Reserva(Date fechaDeEntrada, Date fechaSalida, Hotel hotel,double importe, DatosCliente cliente) {
		this.hotel = hotel;
		this.fechaDeEntrada = fechaDeEntrada;
		this.fechaSalida = fechaSalida;
		this.importe = importe;
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
