package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class Área {
	private int númeroÁrea;
	private String nomeArea;
	private int tamanhoArea; 
	private Set<Planta> plantas= new HashSet<>();
	private Set<SensorDeUmidade> sensores = new HashSet<>();
	
	public Área(int numero, String nome, int tamanho) {
		this.númeroÁrea = numero;
		this.nomeArea = nome;
		this.tamanhoArea = tamanho;
	}
	
	public int getNúmeroÁrea() {
		return númeroÁrea;
	}
	
	public void setNúmeroÁrea(int numero) {
		
		this.númeroÁrea =  numero;
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
		return "[" + "Número da Área: " + númeroÁrea + ", Nome da Área: " + nomeArea + ", tamanho da Área: " + tamanhoArea
				+ ",\n Plantas da Área: " + plantas + ",\n Sensores da Área: " + sensores + "]";
	}
	
}
