package atv3;

import java.util.Scanner;

public class Atv3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double precoLitro, qtd;
		
		System.out.println("Insira o valor do preço do Litro: ");
		precoLitro = scan.nextDouble();
		
		System.out.println("Insira a quantidade a ser abastecida: ");
		qtd = scan.nextDouble();
		
		System.out.println(Abastece(precoLitro,qtd));
		
		scan.close();
	}
	
	static String Abastece(double precoLitro, double qtd) {
		if(precoLitro <= 0 || qtd <= 0) {
			return "O valor inserido é inválido!";		
		}else {
			return "O valor a ser pago será de R$ " + (precoLitro * qtd);
		}
	}
}
