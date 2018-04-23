package cap02;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {

		//Declarando e inicializacao de variaveis
		int x = 10;
		int y = 3;
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("-X = " + (-x));
		System.out.println("X/Y = " + (x/y));
		System.out.println("Resto de x por y = " + (x % y));
		System.out.println("Inteiro de X por Y = " + (int) (x / y));
		System.out.println("X + 1 = " + (++x));
	}

}
