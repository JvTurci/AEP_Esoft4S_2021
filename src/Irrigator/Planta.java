package Irrigator;

public class Planta {
	private int registroPlanta;
	private String nomePlanta;
	private double umidadePlantio;
	
	public Planta(int registroPlanta, String nomePlanta, double umidadePlantio) {
		this.registroPlanta = registroPlanta;
		this.nomePlanta = nomePlanta;
		this.umidadePlantio = umidadePlantio;
	}	
	
	public int getRegistroPlanta() {
		return registroPlanta;
	}
	
	public void setRegistroPlanta(int registroPlanta) {
		this.registroPlanta = registroPlanta;
	}
	
	public String getNomePlanta() {
		return nomePlanta;
	}
	
	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
	}
	
	public double getUmidadePlantio() {
		return umidadePlantio;
	}
	
	public void setUmidadePlantio(double umidadePlantio) {
		this.umidadePlantio = umidadePlantio;
	}

	@Override
	public String toString() {
		return "["+ "Registro da planta: " + registroPlanta + ", Noma da planta: " + nomePlanta + ", Umidade do Plantio: " + umidadePlantio + "]";
	}
	
	
}
