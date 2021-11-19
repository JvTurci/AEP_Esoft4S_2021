package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class Ambiente {
	private String nomeAmbiente;
	private int n�meroAmbiente;
	public Set<�rea> areas = new HashSet<>();
	
	public Ambiente(String nome, int numero) {
		this.nomeAmbiente = nome;
		this.n�meroAmbiente = numero;
	}
	
	public String getNomeAmbiente() {
		return nomeAmbiente;
	}

	public void setNomeAmbiente(String nome) {
		this.nomeAmbiente = nome;
	}

	public int getN�meroAmbiente() {
		return n�meroAmbiente;
	}

	public void setN�meroArea(int numero) {
		this.n�meroAmbiente = numero;
	}

	public Set<�rea> getAreas() {
		return areas;
	}
	
	public void adicionarArea(�rea novaArea) {
		this.areas.add(novaArea);
	}
	
	public void retirarArea(�rea areaRetirada) {
		this.areas.remove(areaRetirada);
	}

	@Override
	public String toString() {
		return "Nome do Ambiente: " + nomeAmbiente + ", N�mero do Ambiente:" + n�meroAmbiente + ",\n Areas do Ambiente:" + areas + "]";
	}
	
	
}
