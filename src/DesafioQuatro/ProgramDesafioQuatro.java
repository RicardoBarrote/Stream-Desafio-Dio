package DesafioQuatro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramDesafioQuatro {

	public static void main(String[] args) {

		/*
		 * Desafio 4/20
		 * 
		 * Instrutora Camila Cavalcante, BootCamp Santander, Plataforma: Digital
		 * Innovation One (Dio).
		 * 
		 * Desafio 4 - Remova todos os valores ímpares:
		 */

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> numerosPares = numeros.stream()
				.filter(x -> x % 2 == 0 || x == 0)
				.collect(Collectors.toList());
		
		numerosPares.forEach(System.out::println);

	}

}
