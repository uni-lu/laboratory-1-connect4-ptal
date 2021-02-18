package lab1;

import java.util.Scanner;

public class Checkers {
  public static void main(String[] args) {
    System.out.println("Welcome to my checker game!");
    Board board = new Board();
    board.print();
    int x = readPositiveInteger("Enter the coordinate: ");
    System.out.println("x = " + x);
  }

  // Incomplete! No test for positive integers.
  public static int readPositiveInteger(String message) {
    Scanner scanner = new Scanner(System.in);
    int res = 0;
    boolean successfulRead = false;
    while(!successfulRead) {
      System.out.print(message);
      if(scanner.hasNextInt()) {
        res = scanner.nextInt();
        successfulRead = true;
      }
      else {
        System.out.println("You must enter an integer.");
        scanner.next();
      }
    }
    return res;
  }
}
