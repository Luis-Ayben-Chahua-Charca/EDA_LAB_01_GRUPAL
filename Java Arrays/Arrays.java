public class Arrays {
	public static void main(String args[]) {
		//declaracion
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    //acceso
    System.out.println(cars[0]);
    // Outputs Volvo
    //cambiar elemento
    cars[0] = "Opel";
    System.out.println(cars[0]);
    // Now outputs Opel instead of Volvo
    //longitud
    System.out.println(cars.length);
    // Outputs 4
  }
}
