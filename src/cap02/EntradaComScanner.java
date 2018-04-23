package cap02;

import java.util.*;

/**
 * 
 * @author bruno.mendes.sesso
 *	Uso da classe Scanner
	Outra possibilidade de entrada de dados pelo usuário se refere ao uso da classe Scanner, disponível
	a partir da versão J2SE 5.0. A grande vantagem dessa classe é possuir diversos métodos para leitura de
	tipos de dados diferentes, característica que facilita o desenvolvimento do código. Da mesma forma
	que na classe BufferedReader, você consegue ler a linha inteira digitada pelo usuário, porém a classe
	Scanner é mais simples de se utilizar.
 */

public class EntradaComScanner {

	public static void main(String[] args) {
		float largura, comprimento;
		double area, perimetro;
		Scanner sc;
		
		try {
			System.out.println("Entre com o comprimento");
			sc = new Scanner(System.in);
			//o método nextFloat que permite ler um valor do tipo float diretamente, sem
			//a necessidade de conversão.
			comprimento = sc.nextFloat();
			
			System.out.println("Entre com a largura");
			sc = new Scanner(System.in);
			//o método nextFloat que permite ler um valor do tipo float diretamente, sem
			//a necessidade de conversão.
			largura = sc.nextFloat();
			
			area = comprimento * largura;
			perimetro = comprimento *2 + largura * 2;

			System.out.println("Área do rêtangulo : " + area);
			System.out.println("Perímetro do rêtangulo : " + perimetro);
			
		} catch (NumberFormatException e) {
			System.out.println("Houve erro na conversão, digite apenas caracteres numericos");
		}

	}

}
