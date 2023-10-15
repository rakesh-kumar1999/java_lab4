package Lab_4;

import java.util.*;

/*find determinant and inverse of a 3x3 matrix */
public class Matrix_inverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M[][] = new int[3][3];//main matrix
        System.out.println("Enter 9 elements for matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {  
                System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }
        int determinant = M[0][0] * ((M[1][1] * M[2][2]) - (M[2][1] * M[1][2]))
                - M[0][1] * ((M[1][0] * M[2][2]) - (M[2][0] * M[1][2]))
                + M[0][2] * ((M[1][0] * M[2][1]) - (M[2][0] * M[1][1]));  
        if(determinant==0){
            System.out.println("As the value of determinant is zero,Inverse of matrix is undefined.");
            System.exit(0);
        }
        int C[][] = new int[3][3];//cofactor matrix
        C[0][0]=(M[1][1]*M[2][2] - M[2][1]*M[1][2]);
        C[0][1]=(-1)*(M[1][0]*M[2][2] - M[2][0]*M[1][2]);
        C[0][2]=(M[1][0]*M[2][1] - M[2][0]*M[1][1]);

        C[1][0]=(-1)*(M[0][1]*M[2][2] - M[2][1]*M[0][2]);
        C[1][1]=(M[0][0]*M[2][2] - M[2][0]*M[0][2]);
        C[1][2]=(-1)*(M[0][0]*M[2][1] - M[2][0]*M[0][1]);

        C[2][0]=(M[0][1]*M[1][2] - M[1][1]*M[0][2]);
        C[2][1]=(-1)*(M[0][0]*M[2][2] - M[1][0]*M[0][2]);
        C[2][2]=(M[0][0]*M[1][1] - M[1][0]*M[0][1]);

        int A[][] = new int[3][3]; //adjoint matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j]=C[j][i];
            }
        }
        System.out.println("determinant = "+determinant);
        double I[][]=new double[3][3];//inverse matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                I[i][j]=(double)A[i][j]/determinant;
            }
        }
        System.out.println("Your  Inverse matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(I[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
