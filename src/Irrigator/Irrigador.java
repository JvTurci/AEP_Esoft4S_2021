package Irrigator;

public class Irrigador {
	private int idIrrigador;
	private boolean estadoIrrigador;

	public Irrigador(int idIrrigador) {
		this.idIrrigador = idIrrigador;
	}

	public int getIdIrrigador() {
		return idIrrigador;
	}
	
	public void setIdIrrigador(int idIrrigador) {
		this.idIrrigador = idIrrigador;
	}
	
	public void setEstadoIrrigador(boolean estadoIrrigador) {
		this.estadoIrrigador = estadoIrrigador;
	}
	
	public boolean getEstadoIrrigador() {
		return estadoIrrigador;
	}

	@Override
	public String toString() {
		return "[" + "Irrigador:" + idIrrigador + "]";
	}
	

}
