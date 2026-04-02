public class snakePatern {
  public static void main(String[] args) {
    int[][] array= {{1,2,3,4},{5,6,7,8},{9,8,7,6},{7,4,8,3},{1,0,8,5},{2,4,6,1}};
    for(int i=0;i<array.length;i++){// i- 0 to 2
      if(i%2==0){
        for(int j=0;j<array[0].length;j++){//j- 0 to3
          System.out.print(array[i][j]+" ");
        }
      }
      else{
        for(int j=array[0].length-1;j>=0;j--){//j- 3 to 0
          System.out.print(array[i][j]+" ");
        }
      }
      // System.out.println();
    }
  }
}
