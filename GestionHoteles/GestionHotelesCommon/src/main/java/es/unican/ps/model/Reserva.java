package es.unican.ps.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Reserva {
	
	private long id;
	private Date fechaDeEntrada;
	private Date fechaSalida;
	private double importe;
	private List<Hotel> hoteles;
	
	public Reserva(long id, Date fechaDeEntrada, Date fechaSalida, double importe) {
		this.hoteles = new ArrayList<Hotel>();
		this.id = id;
		this.fechaDeEntrada = fechaDeEntrada;
		this.fechaSalida = fechaSalida;
		this.importe = importe;
	}
	
}
