import java.util.Scanner;
public class basic2d {
  public static void main(String[] args) {
    // int [][] array =new int[3][5];
    int [][] array ={{3,4,6,7},{3,6,8,2}};
     for(int i=0;i<array.length;i++){
      for(int j =0;j<array[0].length;j++){
        System.out.print( array[i][j]+" ");
      }
      System.out.println();
     }
  }
}
