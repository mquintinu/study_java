package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		// Foreach tradicional
		for (String string : aprovados) {
			System.out.println(string);
		}

		System.out.println("\n>>> Lambda #01");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\n>>> Method Reference #01");
		aprovados.forEach(System.out::println );
		
		System.out.println("\n>>> Lambda #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\n>>> Method Reference #02");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Ol�, meu nome � " + nome);
	}
}
