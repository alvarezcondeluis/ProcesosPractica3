package es.unican.ps.model;


public class DatosPago {
	
	
	
	private final String numTarjeta;
	private final String cvc;
	private final int mesCaducidad;
	private final int anhoCaducidad;
	private final TipoTarjeta tarjeta;
	
	
	public DatosPago(String numTarjeta, String cvc, int mesCaducidad, int anhoCaducidad, TipoTarjeta tarjeta) {
		this.numTarjeta = numTarjeta;
		this.cvc = cvc;
		this.mesCaducidad = mesCaducidad;
		this.anhoCaducidad = anhoCaducidad;
		this.tarjeta = tarjeta;
	}



	public String getNumTarjeta() {
		return numTarjeta;
	}



	public String getCvc() {
		return cvc;
	}



	public int getMesCaducidad() {
		return mesCaducidad;
	}



	public int getAnhoCaducidad() {
		return anhoCaducidad;
	}



	public TipoTarjeta getTipoTarjeta() {
		return tarjeta;
	}



	
}
