package clase05;

import java.util.Scanner;

public class EncodeYDecode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String frase = scn.nextLine();
		System.out.println("Ingrese el desplazamiento");
		int move = Integer.parseInt(scn.nextLine());
		
		byte [] decodedBytes = frase.getBytes();
		for(int j = 0 ; j<frase.length() ; j++) {
			
			decodedBytes[j] = (byte)(decodedBytes[j] + move);
					
			System.out.println(decodedBytes[j]);
		}//fin
		frase = new String(decodedBytes);
		System.out.println(frase);
	}
	public static int contarLetra(String unaP, char letra) {
		int cuenta =0;
		for (int i=0; i < unaP.length();i++) {
			if(unaP.charAt(i) == letra) {
				cuenta = cuenta + 1;
			}
		}
		return cuenta;
	}
}
