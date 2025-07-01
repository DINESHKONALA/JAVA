class while_loop {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println("Current value of i: " + i);
      i++;
        var j = 0;
        while (j <5) {
            System.out.println("Inner loop iteration: " + j);
            j++;
      }
    }
    System.out.println("Loop finished.");




    int b = 10; 
    do{ //do-while loop
      // Print the current value of b
      
      System.out.println("Current value of i: " + b);
            b++; // Increment b by 1

    }while (b < 5);
  }
}
