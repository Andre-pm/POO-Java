package atv4;

public class Atv4 {

	public static void main(String[] args) {
		String valor1 = "teste";
		String valor2 = "teste";
		
		System.out.println("Compara��o com equals(): "+ valor1.equals(valor2));
		System.out.println("Compara��o com equalsIgnoreCase(): " + valor1.equalsIgnoreCase(valor2));
		System.out.println("Compara��o com == : " + (valor1 == valor2));
	}

}
