package clase05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filesAndScanner {

	public static void main(String[] args) {
		String ruta = "resources/text1.txt";
		Path path1 = Paths.get(ruta);
		
		try {
			for(String linea : Files.readAllLines(path1)) {
				if(linea.startsWith("M"))
				System.out.println(linea);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
