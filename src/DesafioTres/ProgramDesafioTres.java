package DesafioTres;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramDesafioTres {

	public static void main(String[] args) {
		
		/*
		 * Desafio 3/20
		 * 
		 * Instrutora Camila Cavalcante, BootCamp Santander, Plataforma: Digital Innovation One (Dio).
		 * 
		 * Desafio 3 - Verifique se todos os números da lista são positivos:
		 */
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosPositivos = numeros.stream()
				.filter(x -> x > 0)
				.collect(Collectors.toList());
		
		numerosPositivos.forEach(System.out::println);
	}

}
