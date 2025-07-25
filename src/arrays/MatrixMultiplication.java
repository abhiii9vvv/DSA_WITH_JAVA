package arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6}};
        int[][] arr2={{7,8},{9,10},{11,12}};

        int rowsA= arr1.length;
        int colsA=arr1[0].length;
        int rowsB= arr2.length;
        int colsB= arr2[0].length;

        if(colsA!=rowsB){
            System.out.println("Not Possible :(");
            return;
        }

        int[][] product=new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        System.out.println("Product->");
        for (int i = 0; i < product.length ; i++) {
            for (int j = 0; j < product[i].length ; j++) {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}
