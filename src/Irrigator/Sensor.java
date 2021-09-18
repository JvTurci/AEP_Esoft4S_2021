package Irrigator;

public class Sensor {
	private int código;
	private double umidade;

	public Sensor(int código, double umidade) {
		this.código = código;
		this.umidade = umidade;
	}
	
	public int getCódigo() {
		return código;
	}
	
	public double getUmidade() {
		return umidade;
	}

}
