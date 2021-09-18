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
		int posi��oParaRemover = -1;
		for(int i=0; i<areas.size();i++) {
			Area paraExluir = areas.get(i);
			if(areaDesejada == paraExluir.getNome()) {
				posi��oParaRemover = i;
				break;
			}
		}
		if(posi��oParaRemover != -1) {
			areas.remove(posi��oParaRemover);
		}
		
	}
	
	public int buscaArea(String areaDesejada) {
		int posi��oParaBuscar = -1;
		for(int i=0; i<areas.size();i++) {
			Area paraEncontar = areas.get(i);
			if(areaDesejada == paraEncontar.getNome()) {
				posi��oParaBuscar = i;
				break;
			}
		}
		return posi��oParaBuscar;
		
	}
	
	public void apresentarArea(String areaDesejada) {
		int posi��oParaPesquisar = -1;
		Area encontrada = null;
		for(int i=0; i<areas.size();i++) {
			Area paraEncontar = areas.get(i);
			if(areaDesejada == paraEncontar.getNome()) {
				posi��oParaPesquisar = i;
				break;
			}
		}
		
		if(posi��oParaPesquisar != -1) {
			encontrada = areas.get(posi��oParaPesquisar);
			System.out.println("Nome da Area: " + encontrada.getNome());
			System.out.println("Unidade de Medida da Area: " + encontrada.getUnidadeMedida());
			System.out.println("Percentual de Umidade da Area: " + encontrada.getPercentualDeUmidade());
		}else {
			System.out.println("Area n�o encontrada!");
		}
		
	}
}
