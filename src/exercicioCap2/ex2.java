package exercicioCap2;

import java.util.*;

/**
 * 
 * @author bruno.mendes.sesso
 *2. Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros.
	O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol.
	O segundo valor corresponde à quantidade de pontos do time lanterna. Considerando que 41 Aspectos
	Fundamentais de Java cada vitória vale 3 pontos, elabore uma classe que calcule o número de vitórias
	necessárias para que o time lanterna alcance (ou ultrapasse) o líder.
 */
public class ex2 {

	public static void main(String[] args) {
		int pontosLider, pontosLanterna, diferencaPontos;
		final int VITORIA = 3;
		Scanner sc;
		
		try {
			System.out.println("Informe o numero de vitórias do lider");
			sc = new Scanner(System.in);
			pontosLider = sc.nextInt();
			
			System.out.println("Informe o numero de vitórias do lanterninha");
			sc = new Scanner(System.in);
			pontosLanterna = sc.nextInt();
			
			//Regra de cada vitoria vale 3 pontos
			pontosLider = pontosLider * VITORIA;
			pontosLanterna = pontosLanterna * VITORIA;
			
			//formula da diferença de pontos entre o lider e o lanterna
			
			diferencaPontos = pontosLider - pontosLanterna;
			
			System.out.println("A direfença de pontos entre o Lider e Lanterninha é de: " + diferencaPontos + "pontos");
		} catch (NumberFormatException e) {
			System.out.println("Informe somente caracteres númericos e inteiros");
		}
	}

}
