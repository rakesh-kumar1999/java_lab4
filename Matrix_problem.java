package Lab_4;
import java.util.*;
// find difference between avg of all even numbers divisible by 5 only and avg of all odd numbers divisible by 7 only in a 4x5 matrix 
public class Matrix_problem {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);        
    int M[][] = new int[4][5];//main matrix
        System.out.println("Enter 20 elements for matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }
        int evenCount=0,oddCount=0;
        int evenSum=0,oddSum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(M[i][j]%2==0&&M[i][j]%5==0){
                    evenCount++;
                    evenSum=evenSum+M[i][j];
                } else if(M[i][j]%2==1&&M[i][j]%7==0){
                    oddCount++;
                    oddSum=oddSum+M[i][j];
                }
            }
        }
        double evenAvg=(double)evenSum/evenCount;
        System.out.println("Averge of all even numbers divisible by 5 only:"+ evenAvg);
        double oddAvg=(double)oddSum/oddCount;
        System.out.println("Averge of all odd numbers divisible by 7 only:"+ oddAvg);
        double difference = evenAvg - oddAvg ;
        System.out.println("Difference between these averge:" + difference);
    }
}
