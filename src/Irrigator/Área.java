package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class �rea {
	private int n�mero�rea;
	private String nomeArea;
	private int tamanhoArea; 
	private Set<Planta> plantas= new HashSet<>();
	private Set<SensorDeUmidade> sensores = new HashSet<>();
	
	public �rea(int numero, String nome, int tamanho) {
		this.n�mero�rea = numero;
		this.nomeArea = nome;
		this.tamanhoArea = tamanho;
	}
	
	public int getN�mero�rea() {
		return n�mero�rea;
	}
	
	public void setN�mero�rea(int numero) {
		
		this.n�mero�rea =  numero;
	}
	
	public String getNomeArea() {
		return nomeArea;
	}
	
	public void setNomeArea(String nome) {
		this.nomeArea = nome;
	}
	
	public int getTamanhoArea() {
		return tamanhoArea;
	}
	
	public void setTamanhoArea(int tamanho) {
		this.tamanhoArea = tamanho;
	}

	public Set<Planta> getPlantas() {
		return new HashSet<>(plantas);
	}

	public void setPlantas(Set<Planta> plantas) {
		this.plantas = plantas;
	}
	
	public boolean getPlantaPeloNome(Planta nomeDaPlanta) {
		return plantas.contains(nomeDaPlanta);
	}
	public Set<SensorDeUmidade> getSensores() {
		return new HashSet<>(sensores);
	}

	public void setSensores(Set<SensorDeUmidade> sensores) {
		this.sensores = sensores;
	}

	public void adicionarPlanta(Planta novaPlanta) {
		this.plantas.add(novaPlanta);
	}
	
	public void retirarPlanta(Planta plantaRetirada) {
		this.plantas.remove(plantaRetirada);
	}
	
	public void adicionarSensor(SensorDeUmidade novoSensor) {
		this.sensores.add(novoSensor);
	}
	
	public void retirarSensor(SensorDeUmidade sensorRetirado) {
		this.sensores.remove(sensorRetirado);
	}

	@Override
	public String toString() {
		return "[" + "N�mero da �rea: " + n�mero�rea + ", Nome da �rea: " + nomeArea + ", tamanho da �rea: " + tamanhoArea
				+ ",\n Plantas da �rea: " + plantas + ",\n Sensores da �rea: " + sensores + "]";
	}
	
}
