package iniciante.uri2057;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int horaDaSaida = input.nextInt();
		int tempoDaViagem = input.nextInt();
		int fusoHorario = input.nextInt();

		if(horaDaSaida==0) {
			horaDaSaida = 24;
		}
		int totalViagem = horaDaSaida + tempoDaViagem + fusoHorario;
		if (totalViagem >= 24) {
			int total = totalViagem - 24;
			System.out.println(total);
		}else {
			System.out.println(totalViagem);
		}

		input.close();
	}

}
