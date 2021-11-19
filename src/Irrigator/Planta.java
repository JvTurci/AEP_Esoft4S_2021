package Irrigator;

public class Planta {
	private int registro;
	private String nome;
	private double umidade;
	
	public Planta(int registro, String nome, double umidade) {
		this.registro = registro;
		this.nome = nome;
		this.umidade = umidade;
	}	
	
	public int getRegistro() {
		return registro;
	}
	
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	public String getPlanta() {
		return nome;
	}
	
	public void setPlanta(String planta) {
		this.nome = planta;
	}
	
	public double getUmidade() {
		return umidade;
	}
	
	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}

	@Override
	public String toString() {
		return "["+ "Registro da planta: " + registro + ", Noma da planta: " + nome + ", Umidade da planta: " + umidade + "]";
	}
	
	
}
