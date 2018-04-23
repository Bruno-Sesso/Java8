package cap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author bruno.mendes.sesso
 *  Uso da classe DataInputStream
	O Exemplo 2.5 recebe o comprimento e a largura de um ret�ngulo em tempo de execu��o e apresenta
	o valor da �rea e do per�metro. A entrada dos dados do usu�rio � realizada por meio da classe
	BufferedReader.
 */

public class EntradaComDataInputStream {

	public static void main(String[] args) {
		String s;
		float largura, comprimento;
		double perimetro, area;
		BufferedReader dado;
		
		try {
			System.out.println("Entre com o comprimento");
			/*objeto dado recebe o que foi digitado pelo usu�rio por meio da linha new
			DataInputStream(System.in).*/
			dado = new BufferedReader(new InputStreamReader(System.in));
			
			//vari�vel s recebe o conte�do texto do objeto dado
			s = dado.readLine();
			
			/*conte�do da vari�vel s � convertido em uma vari�vel num�rica do tipo float por meio
			de Float.parseFloat*/
			comprimento = Float.parseFloat(s);
			
			System.out.println("Entre com a largura");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			largura = Float.parseFloat(s);
			
			area = comprimento * largura;
			perimetro = comprimento * 2 + largura *2;
			
			System.out.println("�rea do r�tangulo : " + area);
			System.out.println("Per�metro do r�tangulo : " + perimetro);
			
		} catch (IOException erro) {
			System.out.println("Houve erro na entrada de dados" + erro.toString());
		} catch (NumberFormatException erro) {
			System.out.println("Houve erro na conversao, digite apenas caracteres numericos"
					+ erro.toString());
		}
	}

}
