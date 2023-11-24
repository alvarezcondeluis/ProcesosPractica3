package es.unican.ps.model;
import lombok.Getter;
import lombok.Setter;



@Getter
public class ReservaTipoHabitacion {
	
	@Getter
	private long idReserva;
	private long idTipoHabitacion;
	private int numHabitaciones;
	private Hotel hote;
	public ReservaTipoHabitacion(long idReserva, long idTipoHabitaciones, int numHabitaciones) {
		this.idReserva = idReserva;
		this.idTipoHabitacion = idTipoHabitaciones;
		this.numHabitaciones = numHabitaciones;
		hote.
	}
	
}
