package iniciante.uri2334;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		boolean dontStop = true;
		while (dontStop) {
			BigInteger p = input.nextBigInteger();
			if(p.equals(new BigInteger("-1"))) {
				dontStop = false;
			}else if (p.equals(new BigInteger("0"))) {
				System.out.println(p);
			} else {
				System.out.println(p.subtract(new BigInteger("1")));
			}
		}
		input.close();
	}

}