package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class Ambiente {
	private String nomeAmbiente;
	private int númeroAmbiente;
	public Set<Área> areas = new HashSet<>();
	
	public Ambiente(String nome, int numero) {
		this.nomeAmbiente = nome;
		this.númeroAmbiente = numero;
	}
	
	public String getNomeAmbiente() {
		return nomeAmbiente;
	}

	public void setNomeAmbiente(String nome) {
		this.nomeAmbiente = nome;
	}

	public int getNúmeroAmbiente() {
		return númeroAmbiente;
	}

	public void setNúmeroArea(int numero) {
		this.númeroAmbiente = numero;
	}

	public Set<Área> getAreas() {
		return areas;
	}
	
	public void adicionarArea(Área novaArea) {
		this.areas.add(novaArea);
	}
	
	public void retirarArea(Área areaRetirada) {
		this.areas.remove(areaRetirada);
	}

	@Override
	public String toString() {
		return "Nome do Ambiente: " + nomeAmbiente + ", Número do Ambiente:" + númeroAmbiente + ",\n Areas do Ambiente:" + areas + "]";
	}
	
	
}
