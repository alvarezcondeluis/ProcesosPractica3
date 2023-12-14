package es.unican.ps.business.impl;

import java.util.Date;   
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import es.unican.ps.DAO.impl.HotelesDAO;
import es.unican.ps.DAO.impl.ReservasDAO;
import es.unican.ps.interfaces.IGestionReservas;
import es.unican.ps.model.DatosCliente;
import es.unican.ps.model.DatosPago;
import es.unican.ps.model.HabitacionesDisponibles;
import es.unican.ps.model.Hotel;
import es.unican.ps.model.Reserva;
import es.unican.ps.model.ReservaTipoHabitacion;
import es.unican.ps.model.TipoHabitacion;
import jakarta.ejb.Stateful;

@Stateful
public class GestionReservas implements IGestionReservas {
	
	public ReservasDAO reservas;
	public HotelesDAO hoteles;
	
	
	
	
	/**
	 * Metodo que devuelve en un mapa el tipo de habitacion asociado con el numero 
	 * de habitaciones que hay disponibles de ese tipo actualmente
	 * 
	 * @param fechaIni Fecha de inicio a partir de la cual se consulta la disponibilidad
	 * @param fechaFin Fecha de fin hasta la que se consulta la disponibilidad
	 * @param hotel Hotel en el que se esta consultando la disponibilidad
	 * @return Mapa con la asociación entre el tipo de habitacion y el numero de disponibles
	 */
	public Map<TipoHabitacion, Integer> consultaDisponibilidad(Date fechaIni, Date fechaFin, Hotel hotel) {
		
		//Obtenemos las reservas y cogemos las del hotel correspondiente
		 
		Map<TipoHabitacion, Integer> habitacionesDisponibles = new HashMap<TipoHabitacion, Integer>();
		Set<Reserva> reservasHotel = this.reservasPorFechaEnHotel(fechaIni, fechaFin, hotel);
		List<TipoHabitacion> habitacionesHotel = hotel.getHabitaciones();
		
		// Obtengo el total de cada tipo de habitaciones del hotel
		for (TipoHabitacion t: habitacionesHotel) {
			habitacionesDisponibles.put(t, t.getDisponibles());
		}
		
		// Para cada habitacion del hotel calculo el numero de habitaciones disponibles
		for (Reserva r: reservasHotel) {
			for (Map.Entry<TipoHabitacion, Integer> map: r.getHabitaciones().entrySet()) {
				int numHabs = map.getValue();
				int disponibles = habitacionesDisponibles.get(map.getKey());
				disponibles -= numHabs;
				habitacionesDisponibles.replace(map.getKey(), disponibles);
			}
			
		}
		return habitacionesDisponibles;
	}
	
	/**
	 * Calcula el precio por noche de las habitaciones introducidas en un mapa
	 * @param habitaciones Mapa asocia el tipo de habitacion con el numero de habitaciones de ese tipo
	 * @return El importe del conjunto de habitaciones introducido por noche
	 */
	public double calculaImportePorNoche (Map<TipoHabitacion, Integer> habitaciones) {
		double importe = 0;
		for (TipoHabitacion t: habitaciones.keySet()) {
			importe += t.getPrecioPorNoche()* habitaciones.get(t);
		}
		return importe;
	}

	public long reservar(Map<TipoHabitacion, Integer> habitacionesAReservar, DatosCliente cliente, Date fechaIni, Date fechaFin,
			DatosPago tarjeta, Hotel hotel) throws Exception {
		// Comprobación de que las habitaciones introducidas siguen disponibles
		
		if (compruebaPuedeReservar(habitacionesAReservar, fechaIni, fechaFin, hotel)) {
			
		}
		
		
		
		
		return 0;
	}
	
	public boolean compruebaPuedeReservar (Map<TipoHabitacion, Integer> habitacionesAReservar, Date fechaIni, Date fechaFin, Hotel hotel) {
		
		Map<TipoHabitacion, Integer> disponibles = this.consultaDisponibilidad(fechaIni, fechaFin, hotel);
		for (TipoHabitacion t: habitacionesAReservar.keySet()) {
			if (habitacionesAReservar.get(t) > disponibles.get(t)) {
				return false;
			}
		}
		return true;
	}

	public Reserva consultarReserva(long idReserva) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva cancelarReserva(long idReserva) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva modificarReserva(long idReserva, Date nuevaFechaIni, Date nuevaFechaFin,
			List<TipoHabitacion> nuevasHab) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Metodo para obtener las reservas de un hotel en un intervalo de
	 * fechas introducidas por parámetro
	 * @param fechaIni Fecha inicial a partir de la cual hay reservas
	 * @param fechaFin Fecha hasta la que se quieren obtener las reservas
	 * @param hotel Hotel del que queremos obtener las reservas
	 * @return Conjunto de reservas para un hotel dentro de unas fechas indicadas
	 */
	private Set<Reserva> reservasPorFechaEnHotel (Date fechaIni, Date fechaFin, Hotel hotel) {
		Set<Reserva> reservas = this.reservas.reservasPorFecha(fechaIni, fechaFin);
		Set<Reserva> reservasHotel = new HashSet<Reserva>();
		for (Reserva r: reservas) {
			if (r.getHotel().equals(hotel)) {
				reservasHotel.add(r);
			}
		}
		return reservasHotel;
	}
	
	private int numHabitaciones(TipoHabitacion t, Set<ReservaTipoHabitacion> habitaciones) {
		int numero = 0;
		for (ReservaTipoHabitacion h : habitaciones) {
			if (h.getTipoHabitacion().equals(t)) {
				numero += h.getNumHabitaciones();
			}
		}
		return numero;
	}
	
	

}
