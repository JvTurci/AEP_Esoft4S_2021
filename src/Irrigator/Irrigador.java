package Irrigator;

public class Irrigador {
	private int idIrrigador;

	public Irrigador(int idIrrigador) {
		this.idIrrigador = idIrrigador;
	}

	public int getIdIrrigador() {
		return idIrrigador;
	}

	public void setIdIrrigador(int idIrrigador) {
		this.idIrrigador = idIrrigador;
	}

	@Override
	public String toString() {
		return "[" + "Irrigador:" + idIrrigador + "]";
	}
	

}
