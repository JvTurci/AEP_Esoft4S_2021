package Irrigator;

public class Area {
	private String nome;
	private String unidadeMedida;
	private double percentualDeUmidade;
	
	public Area(String nome, String unidadeMedida, double percentualDeUmidade) {
		this.nome = nome;
		this.unidadeMedida = unidadeMedida;
		this.percentualDeUmidade = percentualDeUmidade;
	}
	 
	public String getNome() {
		return nome;
	}
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	
	public double getPercentualDeUmidade() {
		return percentualDeUmidade;
	}

}
