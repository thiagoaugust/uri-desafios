package iniciante.uri3174;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		map.put("bonecos", 0);
		map.put("arquitetos", 0);
		map.put("musicos", 0);
		map.put("desenhistas", 0);
		int repete = input.nextInt();

		for (int i = 0; i < repete; i++) {
			String nome = input.next();
			String brinquedo = input.next();
			Integer horas = input.nextInt();
			Integer contagem = map.get(brinquedo);
			map.put(brinquedo, contagem + horas);
		}

		int totalBonecos = map.get("bonecos") / 8;
		int totalArquitetos = map.get("arquitetos") / 4;
		int totalMusicos = map.get("musicos") / 6;
		int totalDesenhistas = map.get("desenhistas") / 12;
		int total = totalArquitetos + totalBonecos + totalDesenhistas + totalMusicos;
		System.out.println(total);

		input.close();
	}

}
