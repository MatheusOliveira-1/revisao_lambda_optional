package application;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {

		System.out.println(":::::::::::::TESTANDO SEM LAMBDA:::::::::::::");
		System.out.println("Imprime todos os elementos da lista!");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		for (Integer n : list) {
			System.out.println(n);
		}

		System.out.println("\n:::::::::::::TESTANDO COM LAMBDA:::::::::::::");
		System.out.println("Imprime todos os elementos da lista!");
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		list2.forEach(n -> System.out.println(n));
	}

}
