package cap02;
import javax.swing.JOptionPane;

/**
 * 
 * @author bruno.mendes.sesso
*	Caixa de diálogo para a entrada de dados
	A linguagem Java dispõe de uma forma gráfica para receber dados do usuário. Trata-se da utilização
	de caixas de diálogo, no caso a caixa gerada a partir da classe JOptionPane.
 */
public class EntradaComJOptionPane {

	public static void main(String[] args) {
		String aux;
		double largura, comprimento, area, perimetro;
		
		try {
			aux = JOptionPane.showInputDialog("Entre com o comprimento");
			comprimento = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com a largura");
			largura = Float.parseFloat(aux);
			
			area = comprimento * largura; 
			perimetro = comprimento *2 + largura * 2;
			
			JOptionPane.showMessageDialog(null, "Área : " + area + "Perímetro : " + perimetro);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite somente caracteres numericos");
		}
		System.exit(0);
	}

}
