import java.util.Scanner;
public class input {
  public static void main(String[] args) {
    Scanner sc =new Scanner( System.in);
    int [][] array =new int[3][2];
    // int [][] array ={{3,4,6,7},{3,6,8,2}};
     for(int i=0;i<array.length;i++){
      for(int j =0;j<array[0].length;j++){
        System.out.print( "enter the element ");
        array[i][j] =sc.nextInt();
      }
      System.out.println();
     }
     for(int i=0;i<array.length;i++){
      for(int j =0;j<array[0].length;j++){
        array[i][j] =sc.nextInt();
        System.out.print( array[i][j]+" ");
      }
      System.out.println();
     }
  }
}
