package es.unican.ps.model;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TipoHabitacion {
	
	private String tipo;
	private double precioPorNoche;
	private int disponibles;
	
	public TipoHabitacion(String tipo, double precioPorNoche, int disponibles) {
		this.tipo = tipo;
		this.precioPorNoche = precioPorNoche;
		this.disponibles = disponibles;
	}
	
}
