package application;

import java.util.Optional;

public class EuAchoEPouco {
	public static void main(String [] args) {
		
		Optional <Object> bloco = Optional.empty();
		
		System.out.println(bloco.isPresent());
		System.out.println(bloco.isEmpty());
	}

}
