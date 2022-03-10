package iniciante.uri2031;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		Map<String,String> tipos = new HashMap<>();
		tipos.put("pedrapedra", "Sem ganhador");
		tipos.put("papelpapel", "Ambos venceram");
		tipos.put("ataqueataque", "Aniquilacao mutua");

		tipos.put("pedrapapel", "Jogador 1 venceu");
		tipos.put("papelpedra", "Jogador 2 venceu");

		tipos.put("pedraataque", "Jogador 2 venceu");
		tipos.put("ataquepedra", "Jogador 1 venceu");

		tipos.put("papelataque", "Jogador 2 venceu");
		tipos.put("ataquepapel", "Jogador 1 venceu");
		
		int repete = input.nextInt();
		String[] resultados = new String[repete];
		
		for (int i = 0; i < repete; i++) {
			String jogador1 = input.next().toLowerCase();
			String jogador2 = input.next().toLowerCase();
			resultados[i] = tipos.get(jogador1+jogador2);
		}
		
		for (String resultado : resultados) {
			System.out.println(resultado);
		}
		
		
		input.close();
	}

}
