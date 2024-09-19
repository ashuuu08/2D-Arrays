public class PrintSpiralMatrix {
    public static void spiralMatrixPrint(int matrix[][]){
        int startcol=0;
        int startrow=0;
        int endcol=matrix[0].length-1;
        int endrow=matrix.length-1;

        while (startcol<=endcol && startrow <= endrow) {
            //for top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i]+" ");
            }
            //for right
            for(int i=startcol+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //for bottum
            for(int i=endcol-1;i>=startcol;i--){
                System.out.print(matrix[endrow][i]+" ");
            }
            //for left
            for(int i=endrow-1;i>startrow;i--){
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    public static void main(String args[]){
        int matrix[][]={{12,32,43,23,45},
                        {33,42,75,31,54},
                        {43,45,65,71,88},
                        {22,43,56,9,8}};
    spiralMatrixPrint(matrix);
    } 
}
