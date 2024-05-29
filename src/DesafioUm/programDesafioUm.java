package DesafioUm;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class programDesafioUm {

	public static void main(String[] args) {

		/*
		 * Desafio 1/20
		 * 
		 * Instrutora Camila Cavalcante, BootCamp Santander, Plataforma: Digital Innovation One (Dio).
		 */
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		Set<Integer> numeroOrdemCrescente = numeros.stream()
				.sorted()
				.collect(Collectors.toSet());

		System.out.println(numeroOrdemCrescente);

		//Utilizei a interface Set para não haver repetições dentro do meu Array.
		//.sorted() - Responsável por organizar a coleção
		//.collect(Collectiors.toSet) - Responsável para retornar de tipo Stream para o tipo Set
	}

}
