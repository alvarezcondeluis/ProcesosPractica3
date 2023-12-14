package es.unican.ps.interfaces;

import java.util.Date;
import java.util.List;
import java.util.Set;

import es.unican.ps.model.DatosCliente;
import es.unican.ps.model.DatosPago;
import es.unican.ps.model.Hotel;
import es.unican.ps.model.Reserva;
import es.unican.ps.model.TipoHabitacion;
import es.unican.ps.model.ReservaTipoHabitacion;


public interface IReservasDAO {
	
	public Reserva creaReserva(Reserva reserva);
	public Reserva reservaPorId(long idReserva);
	public Set<Reserva> reservas();
	public Reserva eliminaReserva(Reserva reserva);
	public Reserva modificarReserva(Reserva reserva);
	public Set<Reserva> reservasPorFecha(Date fechaIni, Date fechaFin);
	
}
