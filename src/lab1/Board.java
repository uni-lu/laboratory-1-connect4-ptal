package lab1;

public class Board {
  int[][] grid;
  public Board() {
    grid = new int[8][8];
  }

  public void print() {
    for(int i=0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        System.out.print("\u25CF ");
      }
      System.out.println();
    }
  }
}
