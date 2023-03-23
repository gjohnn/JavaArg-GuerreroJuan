package clase06Dimensiones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class tryDosdimTest {

	@DisplayName("Dada las medidas de un triángulo, validar el calculo del área")
	@Test
	void testTriangulo() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresar alto");
		double alto = scn.nextDouble();
		System.out.println("Ingresar base");
		double base = scn.nextDouble();
		Triangulo t1 = new Triangulo(alto, base, "Rectángulo");
		System.out.println(t1.calcularArea());
		Assertions.assertEquals(t1.calcularArea(),8.0);
		
	}

}
