package es.unican.ps.model;

public class HabitacionesDisponibles {
	
	
	private TipoHabitacion habitacion;
	private int disponibles;
	
	public HabitacionesDisponibles(TipoHabitacion habitacion, int disponibles) {
		this.habitacion = habitacion;
		this.disponibles = disponibles;
	}

	public TipoHabitacion getHabitacion() {
		return habitacion;
	}


	public int getDisponibles() {
		return disponibles;
	}
	
}
