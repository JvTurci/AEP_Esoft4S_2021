package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class Área {
	private int numero;
	private String nome;
	private int tamanho; 
	private Set<Planta> plantas= new HashSet<>();
	private Set<SensorDeUmidade> sensores = new HashSet<>();
	
	public Área(int numero, String nome, int tamanho) {
		this.numero = numero;
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		
		this.numero =  numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Set<Planta> getPlantas() {
		return new HashSet<>(plantas);
	}

	public void setPlantas(Set<Planta> plantas) {
		this.plantas = plantas;
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
		return "[" + "Número da Área: " + numero + ", Nome da Área: " + nome + ", tamanho da Área: " + tamanho
				+ ",\n Plantas da Área: " + plantas + ",\n Sensores da Área: " + sensores + "]";
	}
	
}
