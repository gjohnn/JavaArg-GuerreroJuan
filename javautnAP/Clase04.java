package javautnAP;

public class Clase04 {

	public static void main(String[] args) {
		int nums[] = new int[] {1,6,10,30,3};
		int resul = sumas(nums);
		System.out.println("Suma: "+resul);
		resul = resul / nums.length;
		showint(resul);
	}
	private static int sumas(int[]numsASumar) {
		int suma = 0;
		for (int i = 0; i < numsASumar.length;i++) {
			suma = suma + numsASumar[i];
		}
		return suma;
	}
	private static void showint(int amostrar) {
		System.out.println(amostrar);
	}
}
