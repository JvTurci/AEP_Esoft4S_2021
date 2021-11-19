package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class SensorDeUmidade {
	private int c�digo;
	private double umidade;
	private Set<Irrigador> irrigadores = new HashSet<>();

	public SensorDeUmidade(int c�digo, double umidade) {
		this.c�digo = c�digo;
		this.umidade = umidade;
	}
	
	public int getC�digo() {
		return c�digo;
	}
	
	public double getUmidade() {
		return umidade;
	}
	
	public void setC�digo(int c�digo) {
		this.c�digo = c�digo;
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
		return "["+ "C�digo do Sensor:" + c�digo + ", Umidade do Sensor:" + umidade + ", irrigadores:" + irrigadores + "]";
	}

}
