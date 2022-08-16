package atv4;

public class Atv4 {

	public static void main(String[] args) {
		String valor1 = "teste";
		String valor2 = "teste";
		
		System.out.println("Comparação com equals(): "+ valor1.equals(valor2));
		System.out.println("Comparação com equalsIgnoreCase(): " + valor1.equalsIgnoreCase(valor2));
		System.out.println("Comparação com == : " + (valor1 == valor2));
	}

}
