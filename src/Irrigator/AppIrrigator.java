package Irrigator;

public class AppIrrigator {
    public static void main(String[] args) {
    	
    	Usuario agricultor01 = new Usuario("Carlos","Gouvea","carlinhosdelas@gmail.com","123456789");
    	Usuario agricultor02 = new Usuario("Romario","Silva","romarinho14@gmail.com","1111111");
    	Usuario agricultor03 = new Usuario("Flavin","DoPneu","flavindopneu@gmail.com","123123123");
    	Usuario agricultor04 = new Usuario("Xaulin","MatadorDePorco","xaulinmatadordeporco@gmail.com","456123000");
    	
		Ambiente ambiente01 = new Ambiente("Plantação de Trigo");
		Ambiente ambiente02 = new Ambiente("Plantação de Soja");
		Ambiente ambiente03 = new Ambiente("Plantação de Milho");
		Ambiente ambiente04 = new Ambiente("Plantação de Feijão");
		
		agricultor01.adicionarAmbiente(ambiente01);
		ambiente01.adicionarArea(new Area("Parte Norte","Hectares",70.00));
		ambiente01.adicionarArea(new Area("Parte Sul","Hectares",85.00));
		
		agricultor02.adicionarAmbiente(ambiente02);
		ambiente02.adicionarArea(new Area("Parte Baixa","Hectares",60.00));
		ambiente02.adicionarArea(new Area("Parte Alta","Hectares",50.00));
		
		agricultor03.adicionarAmbiente(ambiente03);
		ambiente03.adicionarArea(new Area("1/3","Hectares",70.00));
		ambiente03.adicionarArea(new Area("2/3 Sul","Hectares",75.00));
		
		agricultor04.adicionarAmbiente(ambiente04);
		ambiente04.adicionarArea(new Area("Total","Hectares",87.00));
		
		ambiente01.apresentarArea("Parte Norte");
		ambiente02.apresentarArea("Parte Baixa");
		
		System.out.println("A Area buscada está na posição: " + ambiente01.buscaArea("Parte Norte"));
	}
}
