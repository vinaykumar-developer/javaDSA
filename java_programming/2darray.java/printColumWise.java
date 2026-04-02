public class printColumWise {
  public static void main(String[] args) {
    int[][] array= {{1,2,3,4},{ 5,6,7,8},{9,8,7,6}};
    for ( int i =0;i<array[0].length;i++){// it gives number of rows in a 2 dimentional array
      for(int j=0;j<array.length;j++){//it gives number of columns i a 2 dimentional array
        System.out.print( " "+array[j][i]);
      }
      System.out.println();
    }
  }
}
