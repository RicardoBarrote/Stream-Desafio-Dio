package DesafioDois;

import java.util.Arrays;
import java.util.List;

public class ProgramDesafioDois {

	public static void main(String[] args) {
		
		/*
		 * Desafio 2/20
		 * 
		 * Instrutora Camila Cavalcante, BootCamp Santander, Plataforma: Digital Innovation One (Dio).
		 * 
		 * Desafio 2 - Imprima a soma dos números pares da lista:
		 */
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		Integer somaNumeroPares = numeros.stream()
				.filter(x -> x % 2 == 0)
				.reduce(0, (x, y) -> x + y);
		
		System.out.println(somaNumeroPares);
		
		//Valor final = 34
		//Observação: Foi somado com todos números pares da lista, contando com o 4 repetido.
		//.filter() - Utilizamos para filtrar, passando um predicado que pegaria apenas os números pares.
		//.reduce() - Utilizamos para fazer a soma.
		
	}

}
