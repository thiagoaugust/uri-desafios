package iniciante.uri2708;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		String entrada = "";
		int qtdJeeps = 0;
		int qtdPessoas = 0;
		int qtd = 0;
		
		do {
			entrada = input.next();
			
		if(entrada.equalsIgnoreCase("ABEND")) {
			break;
		}else {
			qtd = input.nextInt();
		}
		
		if(entrada.equalsIgnoreCase("SALIDA")) {
				qtdJeeps+=1;
				qtdPessoas +=qtd;
			}else if(entrada.equalsIgnoreCase("VUELTA")){
				qtdJeeps-=1;
				qtdPessoas -=qtd;
			}
		} while (!entrada.equalsIgnoreCase("ABEND"));
		
		System.out.println(qtdPessoas);
		System.out.println(qtdJeeps);
		
		input.close();
	}

}