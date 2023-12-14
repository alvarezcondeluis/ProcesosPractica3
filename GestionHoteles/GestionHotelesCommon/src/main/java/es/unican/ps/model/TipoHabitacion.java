package es.unican.ps.model;


public class TipoHabitacion {
	
	private long idTipoHabitacion;
	private final String tipo;
	private double precioPorNoche;
	private int disponibles;
	
	public TipoHabitacion(long idTipoHabitacion, String tipo, double precioPorNoche, int disponibles) {
		this.idTipoHabitacion = idTipoHabitacion;
		this.tipo = tipo;
		this.precioPorNoche = precioPorNoche;
		this.disponibles = disponibles;
	}

	public long getIdTipoHabitacion() {
		return idTipoHabitacion;
	}

	public void setIdTipoHabitacion(long idTipoHabitacion) {
		this.idTipoHabitacion = idTipoHabitacion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public int getDisponibles() {
		return disponibles;
	}

	public void setDisponibles(int disponibles) {
		this.disponibles = disponibles;
	}

	public String getTipo() {
		return tipo;
	}
}
