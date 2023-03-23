package clase06Auto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Automovil auto = new Automovil();
		System.out.println("Ingresar color");
		String color1 = scn.nextLine();
		System.out.println("Ingresar Vel.Máx");
		int velmax11 = scn.nextInt();
		
		
		auto.setColor(color1);
		auto.setVelMax(velmax11);
		auto.getInfo();
		auto.PruebaEncendido();
	}

}
