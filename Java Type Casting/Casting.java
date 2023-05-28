public class Casting {

	/*
	 * La conversión de tipos(casting) es cuando se asigna un valor de un tipo de
	 * datos primitivo a otro tipo.
	 */

	public static void main(String[] args) {
		double myDouble = 9.78d;
		int myInt = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}
}
