package javautnAP;

import java.util.Scanner;

public class Clase04Scanner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese números separado por UN espacio");
		String nums = scn.nextLine();
		int res = 0;
		for(String numStr : nums.split(" ")) {
			int numero = Integer.parseInt(numStr);
			res = res + numero;
		}
		System.out.println(res);

	}

}
