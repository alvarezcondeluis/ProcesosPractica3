package es.unican.ps.model;

public class ReservaTipoHabitacion {
	
	
	private final Reserva reserva;
	private final TipoHabitacion tipoHabitacion;
	private int numHabitaciones;
	
	
	public ReservaTipoHabitacion(Reserva reserva, TipoHabitacion tipoHabitacion, int numHabitaciones) {
		this.tipoHabitacion = tipoHabitacion;
		this.reserva = reserva;
		this.numHabitaciones = numHabitaciones;
		
	}	

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}
	
	
}
