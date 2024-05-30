package DesafioCinco;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ProgramDesafioCinco {

	public static void main(String[] args) {

		/*
		 * Desafio 5/20
		 * 
		 * Instrutora Camila Cavalcante, BootCamp Santander, Plataforma: Digital
		 * Innovation One (Dio).
		 * 
		 * Desafio 5 - Calcule a média dos números maiores que 5:
		 */

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		Double media = numeros.stream().filter(x -> x > 5)
				.mapToDouble(Integer::doubleValue)
				.average()
				.orElseThrow(() -> new NoSuchElementException("Não foi possível efetuar a média. "));

		System.out.println("Media dos valores acima de 5: " + media);
	}

}
