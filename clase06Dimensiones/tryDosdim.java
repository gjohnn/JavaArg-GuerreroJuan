package clase06Dimensiones;

import java.util.Scanner;

public class tryDosdim {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa el ALTO del triángulo");
		int alto = scn.nextInt();
		System.out.println("Ingresa el ANCHO del triángulo");
		int base = scn.nextInt();
		Triangulo t1 = new Triangulo(alto, base, "Rectángulo");
		t1.showArea();
		

	}
	/*
	public static void main2(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa el ALTO del triángulo");
		int alto = Integer.parseInt(scn.nextLine());
		System.out.println("Ingresa el ANCHO del triángulo");
		int ancho = Integer.parseInt(scn.nextLine());
		

	}*/


}
