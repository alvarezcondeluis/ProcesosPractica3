package es.unican.ps.interfaces;

import java.util.Date;
import java.util.List;

import es.unican.ps.model.DatosCliente;
import es.unican.ps.model.DatosPago;
import es.unican.ps.model.Hotel;
import es.unican.ps.model.Reserva;
import es.unican.ps.model.TipoHabitacion;
import es.unican.ps.model.ReservaTipoHabitacion;


public interface IHotelesDAO {
	
	public Hotel creaHotel(Hotel hotel);
	public Hotel hotelPorNombre(String nombre);
	public Hotel hotelPorId(long idHotel);
	public Hotel eliminaHotel(Hotel hotel);
	public Hotel modificaHotel(Hotel hotel);
	public List<Hotel> hoteles();
	
	
}
