public class JavaContinue {
   public static void main(String args[]) {
      for (int i = 0; i < 10; i++) {
        if (i == 4) {
          continue;
        }
      System.out.println(i);
       }
	   //in while loop
	   int i = 0;
	while (i < 10) {
	  if (i == 4) {
	    i++;
	    continue;
	  }
	  System.out.println(i);
	  i++;
	}
  }
}
