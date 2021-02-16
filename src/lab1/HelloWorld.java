package lab1;
import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    // A scanner is a "tool" to read stuff the user write in the terminal.
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many students? ");
    // Here, we expect the user to write an integer (if she writes something else, it will explode to your face with an exception.)
    // (see Exercise 2.2 to learn how to deal with explosions).
    int n = scanner.nextInt();
    // We create an array of n elements, all elements are initialized to 0.
    int[] grades = new int[n];
    // We rely on a function to gather the grades from the user.
    enterGrades(scanner, grades);

    // Helper function to compute the average value of an array.
    int average = computeGradesAverage(grades);
    System.out.println("The average is " + average);

    // We print a message to students.
    gradesAnalysis(average, grades);
  }

  static void enterGrades(Scanner scanner, int[] grades) {
    // Here grades.length refers to the length of the array, here is equal to `n` previously read.
    System.out.print("Please enter the " + grades.length + " grades: ");
    // We read the user input one by one with "nextInt", spaces are automatically read.
    // Same problem as before if the user enters something unexpected... So you should deal with that in your work.
    for(int i = 0; i < grades.length; ++i) {
      grades[i] = scanner.nextInt();
    }
  }

  static int computeGradesAverage(int[] grades) {
    int sum = 0;
    for(int i = 0; i < grades.length; ++i) {
      sum += grades[i];
    }
    return sum / grades.length;
  }

  static void gradesAnalysis(int average, int[] grades) {
    for(int i = 0; i < grades.length; i++) {
      System.out.print("Professor Rick Sanchez says: ");
      if(grades[i] < average) {
        if(grades[i] >= 10) {
          System.out.println("What! Wait! A universe where more than half of the students succeed is mathematically impossible Morty!");
        }
        else {
          System.out.println("Burp.");
        }
      }
      else if(grades[i] > average) {
        if(grades[i] < 16) {
          System.out.println("Burp.");
        }
        else {
          System.out.println("What a show off. Burp");
        }
      }
      else {
        System.out.println("Morty?");
      }
    }
  }

}