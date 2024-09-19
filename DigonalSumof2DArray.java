public class DigonalSumof2DArray {
    public static int digonalSum(int matrix[][]){
        int primarySum=0;
        int secundrySum=0;
       for (int i = 0; i < matrix.length; i++) {
        for(int j=0;j<matrix[0].length;j++){
            if (i==j) {
                primarySum+=matrix[i][j];
            }
            else if(i+j==matrix.length-1){
                secundrySum+=matrix[i][j];
            }
             
            }
       }
        return primarySum+secundrySum;
    }
    
    public static void main(String args[]){
        int matrix[][]={{12,32,43},
                        {33,42,75},
                        {43,45,65}};
        System.out.println(digonalSum(matrix));
    }
}
