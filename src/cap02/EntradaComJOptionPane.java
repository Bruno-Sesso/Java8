package cap02;
import javax.swing.JOptionPane;

/**
 * 
 * @author bruno.mendes.sesso
*	Caixa de di�logo para a entrada de dados
	A linguagem Java disp�e de uma forma gr�fica para receber dados do usu�rio. Trata-se da utiliza��o
	de caixas de di�logo, no caso a caixa gerada a partir da classe JOptionPane.
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
			
			JOptionPane.showMessageDialog(null, "�rea : " + area + "Per�metro : " + perimetro);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Houve erro na convers�o, digite somente caracteres numericos");
		}
		System.exit(0);
	}

}
