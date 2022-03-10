package iniciante.uri1973;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int contador = 0;
		Scanner input = new Scanner(System.in);
		int numeroDeSitiosSaqueados = 0;
		int totalDosSitios = 0;
		int numeroDeSitios = input.nextInt();
		long[] sitios = new long[numeroDeSitios];
		boolean firstTime = true;

		totalDosSitios = carregaQuantidadesDosSitios(input, totalDosSitios, numeroDeSitios, sitios);

		while (contador >= 0 && contador < numeroDeSitios) {
			if (sitios[contador] == 0) {
				break;
			} else {
				if (sitios[contador] % 2 != 0) {
					sitios[contador]--;
					totalDosSitios--;
					contador++;
					numeroDeSitiosSaqueados++;
				} else {
					if(firstTime) {
						numeroDeSitiosSaqueados++;
						firstTime = false;
					}
					sitios[contador]--;
					totalDosSitios--;
					contador--;
				}
			}
		}
		System.out.println(numeroDeSitiosSaqueados + " " + totalDosSitios);
		input.close();
	}

	private static int carregaQuantidadesDosSitios(Scanner input, int totalDosSitios, int numeroDeSitios, long[] sitios) {
		for (int i = 0; i < numeroDeSitios; i++) {
			int quantidadeDoSitio = input.nextInt();
			sitios[i] = quantidadeDoSitio;
			totalDosSitios = totalDosSitios + quantidadeDoSitio;
		}
		return totalDosSitios;
	}

}