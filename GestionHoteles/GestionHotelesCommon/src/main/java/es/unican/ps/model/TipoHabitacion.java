package es.unican.ps.model;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
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
}
