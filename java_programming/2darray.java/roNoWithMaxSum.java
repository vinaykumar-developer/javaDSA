public class roNoWithMaxSum {
  public static void main(String[] args) {
    int[][] array= {{1,2,3,4},{ 5,6,7,8},{9, 8,7,6}};
   int maxSumRow = Integer.MIN_VALUE;
   
   int index=-1;
   for ( int i =0;i<array.length;i++){
      int sum=0;
      for(int j=0;j<array[0].length;j++){
        sum+=array[i][j];
      }
      if(sum>maxSumRow){
        maxSumRow=sum;
        index=i+1;
      }
   }
   System.out.println("the maximum sum of the row "+index+" is "+maxSumRow);
  }
   
}