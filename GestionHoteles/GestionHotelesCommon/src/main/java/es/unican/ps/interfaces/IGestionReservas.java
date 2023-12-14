package es.unican.ps.interfaces;

import java.util.Date; 
import java.util.List;

import java.util.Map;

import es.unican.ps.model.DatosCliente;
import es.unican.ps.model.DatosPago;
import es.unican.ps.model.Hotel;
import es.unican.ps.model.Reserva;
import es.unican.ps.model.TipoHabitacion;
import jakarta.ejb.Remote;


@Remote
public interface IGestionReservas {
	
	public Map<TipoHabitacion, Integer> consultaDisponibilidad(Date fechaIni, Date fechaFin, Hotel hotel);
	public long reservar(Map<TipoHabitacion, Integer> habitaciones, DatosCliente cliente, Date fechaIni, Date fechaFin, DatosPago tarjeta, Hotel hotel) throws Exception;
	public Reserva consultarReserva(long idReserva);
	public Reserva cancelarReserva(long idReserva);
	public Reserva modificarReserva(long idReserva, Date nuevaFechaIni, Date nuevaFechaFin, List<TipoHabitacion> nuevasHab);
}
