 package Lab_4;
import java.util.*;
/*WAP to compute following using Array sort 10 numbers in acsending and descending order*/
 public class Sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array in ascending order:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nArray in descending order:");
        for(int i=9;i>0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
 }