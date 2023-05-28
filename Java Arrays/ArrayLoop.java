public class ArrayLoop {
	public static void main(String args[]) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
    //loop for-each
    for (type variable : arrayname) {
      ...
    }
    //example
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
