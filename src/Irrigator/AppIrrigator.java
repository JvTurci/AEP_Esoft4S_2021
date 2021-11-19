package Irrigator;

import java.util.Scanner;

public class AppIrrigator {
    public static void main(String[] args) {
    	
    	Agricultor Amadeu = new Agricultor("123456654321", "AMADEU SEVERINO SILVA", "AMADEU.SEVERINO@EMAIL.COM", "SEVERINO123");
    	Agricultor Carlos = new Agricultor("789456987654", "CARLOS HENRIQUE PINHO", "CARLOS.PINHO@EMAIL.COM", "FAZENDAPINHO");
    	
    	Ambiente soja_milho = new Ambiente("Soja e Milho", 1);
    	Ambiente tomates = new Ambiente("Tomates", 1);
    	
    	Área areaSoja_Milho = new Área(100,"SOJA 2 MESES", 789456);
    	Área areaTomate = new Área(60,"TOMATE CEREJA", 123456);
    	
    	Planta tomateCereja = new Planta(1,"TOMATE CEREJA",96.000);
    	Planta sojaEdamame = new Planta(2,"SOJA EDAMAME",72.000);
    	Planta sojaBRS = new Planta(3,"SOJA BRS 7582",105.000);
    	Planta milhoSafra = new Planta(4,"MILHO SAFRA",100.000);
    	Planta milhoSafrinha = new Planta(5,"MILHO SAFRINHA",50.000);
    	
    	Irrigador irrigadorUm = new Irrigador(1);
    	Irrigador irrigadorDois = new Irrigador(2);
    	Irrigador irrigadorTres = new Irrigador(3);
    	Irrigador irrigadorQuatro = new Irrigador(4);
    	Irrigador irrigadorCinco = new Irrigador(5);
    	Irrigador irrigadorSeis = new Irrigador(6);
    	
    	SensorDeUmidade sensorUm = new SensorDeUmidade(1,98.234);
    	SensorDeUmidade sensorDois = new SensorDeUmidade(2,70.004);
    	SensorDeUmidade sensorTres = new SensorDeUmidade(3,103.711);
    	
    	sensorUm.adicionarIrrigador(irrigadorUm);
    	sensorUm.adicionarIrrigador(irrigadorDois);
    	
    	sensorDois.adicionarIrrigador(irrigadorTres);
    	sensorDois.adicionarIrrigador(irrigadorQuatro);
    	
    	sensorTres.adicionarIrrigador(irrigadorCinco);
    	sensorTres.adicionarIrrigador(irrigadorSeis);
    	
    	areaSoja_Milho.adicionarPlanta(sojaEdamame);
    	areaSoja_Milho.adicionarPlanta(sojaBRS);
    	areaSoja_Milho.adicionarPlanta(milhoSafra);
    	areaSoja_Milho.adicionarPlanta(milhoSafrinha);
    	
    	areaSoja_Milho.adicionarSensor(sensorDois);
    	areaSoja_Milho.adicionarSensor(sensorTres);
    	
    	areaTomate.adicionarPlanta(tomateCereja);
    	areaTomate.adicionarSensor(sensorUm);
    	
    	soja_milho.adicionarArea(areaSoja_Milho);
    	tomates.adicionarArea(areaTomate);
    	
    	Carlos.adicionarAmbiente(soja_milho);
    	Amadeu.adicionarAmbiente(tomates);
    	
    	if(areaTomate.getPlantaPeloNome(tomateCereja)) {
    		System.out.println("Essa área contem essa planta!");
    	}else {
    		System.out.println("Essa área não contem essa planta!");
    	}
    	
    	System.out.println(Carlos.getAmbientes());
    	System.out.println(Amadeu.getAmbientes());
    }
}
