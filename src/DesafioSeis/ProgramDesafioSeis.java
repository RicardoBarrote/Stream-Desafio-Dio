package DesafioSeis;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ProgramDesafioSeis {

	public static void main(String[] args) {

		/*
		 * Desafio 6/20
		 * 
		 * Instrutora Camila Cavalcante, BootCamp Santander, Plataforma: Digital
		 * Innovation One (Dio).
		 * 
		 * Desafio 6 - Verificar se a lista contém algum número maior que 10:
		 */

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> numeroMaiorQueDez = numeros.stream()
				.filter(x -> x > 10)
				.collect(Collectors.toList());
		try {
			if (!numeroMaiorQueDez.isEmpty()) {
				numeroMaiorQueDez.forEach(System.out::println);
			} 
			else {
				throw new NoSuchElementException("Não existe números maior que 10. ");
			}

		} 
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());

		}

	}

}
