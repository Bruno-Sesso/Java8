package cap02;

import java.util.*;

/**
 * 
 * @author bruno.mendes.sesso
 *	Uso da classe Scanner
	Outra possibilidade de entrada de dados pelo usu�rio se refere ao uso da classe Scanner, dispon�vel
	a partir da vers�o J2SE 5.0. A grande vantagem dessa classe � possuir diversos m�todos para leitura de
	tipos de dados diferentes, caracter�stica que facilita o desenvolvimento do c�digo. Da mesma forma
	que na classe BufferedReader, voc� consegue ler a linha inteira digitada pelo usu�rio, por�m a classe
	Scanner � mais simples de se utilizar.
 */

public class EntradaComScanner {

	public static void main(String[] args) {
		float largura, comprimento;
		double area, perimetro;
		Scanner sc;
		
		try {
			System.out.println("Entre com o comprimento");
			sc = new Scanner(System.in);
			//o m�todo nextFloat que permite ler um valor do tipo float diretamente, sem
			//a necessidade de convers�o.
			comprimento = sc.nextFloat();
			
			System.out.println("Entre com a largura");
			sc = new Scanner(System.in);
			//o m�todo nextFloat que permite ler um valor do tipo float diretamente, sem
			//a necessidade de convers�o.
			largura = sc.nextFloat();
			
			area = comprimento * largura;
			perimetro = comprimento *2 + largura * 2;

			System.out.println("�rea do r�tangulo : " + area);
			System.out.println("Per�metro do r�tangulo : " + perimetro);
			
		} catch (NumberFormatException e) {
			System.out.println("Houve erro na convers�o, digite apenas caracteres numericos");
		}

	}

}
