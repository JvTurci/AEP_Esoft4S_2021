package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class SensorDeUmidade {
	private int código;
	private double umidade;
	private Set<Irrigador> irrigadores = new HashSet<>();

	public SensorDeUmidade(int código, double umidade) {
		this.código = código;
		this.umidade = umidade;
	}
	
	public int getCódigo() {
		return código;
	}
	
	public double getUmidade() {
		return umidade;
	}
	
	public void setCódigo(int código) {
		this.código = código;
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
		return "["+ "Código do Sensor:" + código + ", Umidade do Sensor:" + umidade + ", irrigadores:" + irrigadores + "]";
	}

}
