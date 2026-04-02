public class sum {
  public static void main(String[] var0) {
  int [][] array ={{3,4,6,7},{3,6,8,2},{9,4,6,0}};
  // code to find maximmum of 2 dimentional array
  // int sum=0;
  //    for(int i=0;i<array.length;i++){
  //     for(int j =0;j<array[0].length;j++){
  //       System.out.print( array[i][j]+" ");
  //       sum+=array[i][j];
  //     }
  //     System.out.println();
  //    }
  //    System.out.println("the sum of this 2 dimentional arrry is "+sum);
    


  // code to find maximum ellement of 2 dimentional array 
  int max =array[0][0];
   for(int i=0;i<array.length;i++){
    for(int j=0;j<array[0].length-1;j++){
      if(array[i][j+1]>array[i][j])
       max=array[i][j+1];
    }
   }
   System.out.println("the maximum element of 2d array is "+max);
   }
}
