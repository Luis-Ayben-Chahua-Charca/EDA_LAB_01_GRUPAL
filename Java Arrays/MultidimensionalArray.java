public class MultidimensionalArray{
	public static void main(String args[]) {
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    //acceso a un elemento
    System.out.println(myNumbers[1][2]); // Outputs 7
    //cambiar elemento
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
    //loop
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
