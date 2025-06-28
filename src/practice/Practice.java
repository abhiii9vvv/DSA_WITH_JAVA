package First.src.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of ROWS");
        int row= sc.nextInt();
//        System.out.print("Enter the number of COLUMNS");
//        int column=sc.nextInt();
        int i,j,k,l;

        for(i=1;i<=row;i++){
            for (j=i;j<=row;j++){
                System.out.print(j);
            }
            for (k=1;k<=i;k++){
                System.out.print(k);
            }

            System.out.println();
        }

    }
}
