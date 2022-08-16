package ifsc;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class PrimeiroProgramaJava {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Bruna");
		lista.add("Luana");
		lista.add("André");
		
		System.out.println("Tamanho da lista: " + lista.size());
		System.out.println("Lista está vázia: " + lista.isEmpty());
		System.out.println("Conteúdo da lista: " + lista.toString());
		
//		Forma indo por item:
		for(String item : lista ) {
			System.out.println(item);
		}
		
//		Forma indo pelo index:
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		int contador = 0;
		while(contador < lista.size()) {
			System.out.println(lista.get(contador));
			contador++;
		}
	}

}
