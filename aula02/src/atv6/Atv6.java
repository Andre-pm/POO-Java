package atv6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Atv6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double[] salarios = new double[10];
	
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println("Insira o " + i +"º salário: ");
		salarios[i] = scan.nextDouble();
	}
	
	Arrays.sort(salarios);
	
	for (int i = 0; i < 10; i++) {
		System.out.println(salarios[i]);
	}
	
//	Arrays.sort(salarios, Collections.reverseOrder());
}
}
