package Irrigator;

import java.util.HashSet;
import java.util.Set;

public class Ambiente {
	private String nome;
	private int numero;
	public Set<�rea> areas = new HashSet<>();
	
	public Ambiente(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
		return "Nome do Ambiente: " + nome + ", N�mero do Ambiente:" + numero + ",\n Areas do Ambiente:" + areas + "]";
	}
	
	
}
