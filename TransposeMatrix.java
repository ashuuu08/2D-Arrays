public class TransposeMatrix {

    public static void  transpose(int matrix[][]){
      int newMatrix[][] = new int[matrix[0].length][matrix.length];
      for(int i=0;i<matrix[0].length;i++){
        for(int j=0;j<matrix.length;j++){
            newMatrix[i][j]= matrix[j][i];
            System.out.print(newMatrix[i][j]+"  ");
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
        int matrix[][]={
                        {2,3,4,5,6},
                        {0,9,8,7,6}
                        };
    transpose(matrix);
    }
}
