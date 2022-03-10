package iniciante.uri2139;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		while(input.hasNext()) {
			int mes = input.nextInt();
			int dia = input.nextInt();

			int natal = LocalDate.of(2016, 12, 25).getDayOfYear();
			int hoje = LocalDate.of(2016, mes, dia).getDayOfYear();

			Map<Integer, String> mapDia = new HashMap<>();
			mapDia.put(0, "E natal!");
			mapDia.put(1, "E vespera de natal!");

			int resultado = natal - hoje;

			if (resultado < 0) {
				System.out.println("Ja passou!");
			}else if(resultado>1){
				System.out.println("Faltam "+ resultado + " dias para o natal!");
			}else{
				System.out.println(mapDia.get(resultado));
			}

		}
		input.close();
	}

}
