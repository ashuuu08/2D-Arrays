public class PrintSecontRowSum {
    public static int printSumOfRow(int matrix[][],int row) {
        int sum=0;
        for(int i=row-1;i<row;i++){
            for(int j=0;j<matrix[0].length;j++){
             sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                        {8,8,7},
                        {3,2,5},
                        {7,7,1}};
    System.out.println(printSumOfRow(matrix, 2)  );               
    }
}
