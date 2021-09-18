package Irrigator;

import java.util.ArrayList;
import java.util.List;

public class Ambiente {
	private String nome;
	public List<Area> areas = new ArrayList<>();
	
	public Ambiente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Area> getAreas() {
		return areas;
	}
	
	public void adicionarArea(Area nova) {	
		this.areas.add(nova);
	}

	public void removerArea(String areaDesejada) {
		int posiçãoParaRemover = -1;
		for(int i=0; i<areas.size();i++) {
			Area paraExluir = areas.get(i);
			if(areaDesejada == paraExluir.getNome()) {
				posiçãoParaRemover = i;
				break;
			}
		}
		if(posiçãoParaRemover != -1) {
			areas.remove(posiçãoParaRemover);
		}
		
	}
	
	public int buscaArea(String areaDesejada) {
		int posiçãoParaBuscar = -1;
		for(int i=0; i<areas.size();i++) {
			Area paraEncontar = areas.get(i);
			if(areaDesejada == paraEncontar.getNome()) {
				posiçãoParaBuscar = i;
				break;
			}
		}
		return posiçãoParaBuscar;
		
	}
	
	public void apresentarArea(String areaDesejada) {
		int posiçãoParaPesquisar = -1;
		Area encontrada = null;
		for(int i=0; i<areas.size();i++) {
			Area paraEncontar = areas.get(i);
			if(areaDesejada == paraEncontar.getNome()) {
				posiçãoParaPesquisar = i;
				break;
			}
		}
		
		if(posiçãoParaPesquisar != -1) {
			encontrada = areas.get(posiçãoParaPesquisar);
			System.out.println("Nome da Area: " + encontrada.getNome());
			System.out.println("Unidade de Medida da Area: " + encontrada.getUnidadeMedida());
			System.out.println("Percentual de Umidade da Area: " + encontrada.getPercentualDeUmidade());
		}else {
			System.out.println("Area não encontrada!");
		}
		
	}
}
