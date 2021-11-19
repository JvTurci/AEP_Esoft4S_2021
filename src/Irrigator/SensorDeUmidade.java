package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class SensorDeUmidade {
	private int idSensor;
	private double umidade;
	private Set<Irrigador> irrigadores = new HashSet<>();

	public SensorDeUmidade(int código, double umidade) {
		this.idSensor = código;
		this.umidade = umidade;
	}
	
	public int getIdSensor() {
		return idSensor;
	}
	
	public double getUmidade() {
		return umidade;
	}
	
	public void setIdSensor(int idSensor) {
		this.idSensor = idSensor;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}

	public Set<Irrigador> getIrrigadores() {
		return irrigadores;
	}

	public void setIrrigadores(Set<Irrigador> irrigadores) {
		this.irrigadores = irrigadores;
	}
	
	public void adicionarIrrigador(Irrigador novoIrrigador) {
		this.irrigadores.add(novoIrrigador);
	}
	
	public void removerIrrigador(Irrigador irrigadorRetirado) {
		this.irrigadores.remove(irrigadorRetirado);
	}

	@Override
	public String toString() {
		return "["+ "Id do Sensor:" + idSensor + ", Umidade do Sensor:" + umidade + ", irrigadores:" + irrigadores + "]";
	}

}
