package exercicioCap2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**	
 * 
 * @author bruno.mendes.sesso
 *	Exercicio 1 
 *	Usando a classe BufferedReader para entrada de dados, crie uma classe que receba o valor de um
	produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto
	com o desconto.
 */
public class ex1 {

	public static void main(String[] args) {
		String p;
		double vlrProduto, vlrDesconto, percentual;
		BufferedReader dado;
		
		try {
			System.out.println("Informe o valor do produto");
			dado = new BufferedReader(new InputStreamReader(System.in));
			p = dado.readLine();
			vlrProduto = Double.parseDouble(p);

			System.out.println("Informe o valor do desconto");
			dado = new BufferedReader(new InputStreamReader(System.in));
			p = dado.readLine();
			vlrDesconto = Double.parseDouble(p);
			
			percentual = vlrProduto * vlrDesconto / 100;
			
			System.out.println("Valor do produto : " + vlrProduto);
			System.out.println("Valor do produto com desconto : " + (vlrProduto - percentual));			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
