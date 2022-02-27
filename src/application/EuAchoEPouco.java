package application;

import java.util.Optional;

public class EuAchoEPouco {
	public static void main(String [] args) {
		
		Optional <String> blocovazio = Optional.empty();//O optional 'empty' deve estar sempre vazio
		
		System.out.println(":::::::::::TESTANDO OPTIONAL EMPTY:::::::::::");
		System.out.println("isPresent: " + blocovazio.isPresent());
		System.out.println("isEmpty: " + blocovazio.isEmpty());
		
		Optional <String> blococheio = Optional.of("\nGeneration Largo da Batata");//O optional 'of' deve sempre conter alguma informação
		
		System.out.println("\n:::::::::::TESTANDO OPTIONAL OF:::::::::::");
		System.out.println("isPresent: " + blococheio.isPresent());
		System.out.println("isEmpty: " + blococheio.isEmpty());
		
		String resposta = blococheio.orElse("Mas eu só tenho 6 anos");
		
		System.out.println(resposta);
		
		Optional <String> blococheioorelse = Optional.ofNullable(null);//O optional 'ofNullAble' pode ou não ter um valor.
		
		System.out.println("\n:::::::::::TESTANDO OFNULLABLE E ORELSE:::::::::::");
		System.out.println("isPresent: " + blococheioorelse.isPresent());
		System.out.println("isEmpty: " + blococheioorelse.isEmpty());
		
		String resposta2 = blococheioorelse.orElse("\nMas eu só tenho 6 anos");
		
		System.out.println(resposta2);
		
		Optional <String> blocomap = Optional.ofNullable(null);	
		System.out.println("\n:::::::::::TESTANDO OPTIONAL MAP:::::::::::");
		System.out.println("isPresent: " + blocomap.isPresent());
		System.out.println("isEmpty: " + blocomap.isEmpty());
		
		String respostamap = blocomap.map(String:: toUpperCase)
									   .orElse("\nMas eu só tenho 6 anos");
		
		System.out.println(respostamap);
		
		
		
	}

}