package cap02;

public class ConversaoDeTipos {

	public static void main(String[] args) {
		// TODO Conversao de valores
		String s1 = "10";
		int v = Integer.parseInt(s1);
		float x = Float.parseFloat(s1);
		double y = Double.parseDouble(s1);
		int w = (int) x;
		int z = (int) y;
		String s2 = String.valueOf(y);
		
		System.out.println(s2 + w + z);
	}

}
