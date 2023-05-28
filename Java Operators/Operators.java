public class Operators {
	public static void main(String[] args) {
		// Los operadores se utilizan para realizar operaciones sobre variables y
		// valores.
		int x = 100 + 50;
		System.out.println(x);
		// Aunque el operador se usa a menudo para sumar dos valores, como en el ejemplo
		// anterior, también se puede usar para sumar una variable y un valor, o una
		// variable y otra variable:+
		int sum1 = 100 + 50; // 150 (100 + 50)
		int sum2 = sum1 + 250; // 400 (150 + 250)
		int sum3 = sum2 + sum2; // 800 (400 + 400)
		System.out.println(sum3);

		int x1 = 5;
		int y1 = 3;
		System.out.println(x1 > y1); // devuelve verdadero, porque 5 es mayor que 3
		/*
		 * Java divide los operadores en los siguientes grupos:
		 * 
		 * Operadores aritméticos
		 * Operadores de asignación
		 * Operadores de comparación
		 * Operadores lógicos
		 * Operadores bit a bit
		 */
	}
}
