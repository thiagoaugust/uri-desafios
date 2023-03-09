package iniciante.uri2712;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		Map<Character, String> rodizio = new HashMap<>();
		rodizio.put('1', "MONDAY");
		rodizio.put('2', "MONDAY");
		rodizio.put('3', "TUESDAY");
		rodizio.put('4', "TUESDAY");
		rodizio.put('5', "WEDNESDAY");
		rodizio.put('6', "WEDNESDAY");
		rodizio.put('7', "THURSDAY");
		rodizio.put('8', "THURSDAY");
		rodizio.put('9', "FRIDAY");
		rodizio.put('0', "FRIDAY");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			String placa = input.next();
			String[] placaSplit = placa.split("-");
			if(!isPlacaInRightFormat(placa, placaSplit)) {
				System.out.println("FAILURE");
			} else {
				System.out.println(rodizio.get(placaSplit[1].charAt(3)));
			}
		}

		input.close();
	}
	
	public static boolean isPlacaInRightFormat(String placa, String[] placaSplit) {
		String regex = "^[A-Z]+$";
		if(placaSplit.length == 1 || placaSplit[0].length() != 3 || placaSplit[1].length() != 4 || !placaSplit[0].matches(regex)) {
			return false;
		} else {
			try {
		        long d = Long.parseLong( placaSplit[1]);
		        return true;
		    } catch (NumberFormatException nfe) {
		    	return false;
		    }
			
		}
		
		
	}

}
