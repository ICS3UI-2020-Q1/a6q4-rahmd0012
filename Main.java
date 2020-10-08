import java.util.Scanner;
/**
 * a program to figure out the dot product using 3d vectors
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    int[] integers = new int[3];
        
    // ask the user to enter 3 values
    System.out.println("Please enter the 3 values for the first vector");
    // create a for loop to get the 3 values
    for(int i = 0; i < 3; i++){
    integers[i] = input.nextInt();
    }

    int[] integers2 = new int[3];

    // ask the user to enter 3 more values
    System.out.println("Please enter the 3 values for the second vector");
    // create a for loop to get the second 3 values
    for(int i = 0; i < 3; i++){
    integers2[i] = input.nextInt();
    }

    // create a variable that multiplies the x values
    int xValue = (integers[0]) * (integers2[0]);

    // create a variable that multiplies the y values
    int yValue = (integers[1]) * (integers2[1]);

    // create a variable that multiplies the z values
    int zValue = (integers[2]) * (integers2[2]);

    // create a variables that adds them all
    int total = xValue + yValue + zValue;

    // tell the user the dot product
    System.out.println("The dot product is " + total);
  }
}
