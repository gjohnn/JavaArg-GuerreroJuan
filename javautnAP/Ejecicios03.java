package javautnAP;

import java.util.Arrays;
import java.util.Comparator;

public class Ejecicios03 {

	public static void main(String[] args) {
		System.out.println("Punto 1 :");
		String varString = "Bienvenidos a la clase04";
		char letra = 'i';
		int apariciones = 0;
		for(int i=0; i < varString.length(); i++) {
			if(varString.charAt(i)==letra) {
				apariciones++;
			}
		}
		System.out.println("El string "+varString+" tiene la letra "+letra+" en "+apariciones+ " ocasiones.");
		System.out.println("PUNTO 2 : Ordenar numeros de forma ascendente o descendente:");
		Integer num[]= {-4,24,3};
		boolean aod = false;
		if(aod) {
			//menor a mayor
			Arrays.sort(num);
		}else {
			//mayor a menor
			Arrays.sort(num, Comparator.reverseOrder());
		}
		for (int el : num) {
			System.out.println(el);
		}
		System.out.println("PUNTO 3: dado un vector y un numero X, que sume los numeros > X y retorne el resultado");
		Integer vecnum[]= {10,20,30,40,50-32-2};
		int x = 40;
		int sumnums = 0;
		for (int vec : vecnum) {
			if(vec > x) {
				 sumnums = sumnums + vec;
			}
		}
		System.out.println(sumnums);
	}

}
