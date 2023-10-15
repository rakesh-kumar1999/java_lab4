package Lab_4;

import java.util.*;

/*find sum of product of consecutive numbers in which 1st number should be divisible by 2 and 5 
and 2nd number should be divisible by 3 and 5 in an array of 10 numbers*/
public class SOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sop = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 5 == 0) {
                int j = i + 1;
                if (arr[j] % 3 == 0 && arr[j] % 5 == 0)
                    sop = sop + (arr[i] * arr[j]);
            }
        }
        System.out.println("sum of product of consecutive numbers having conditions: " + sop);
        sc.close();
    }
}
