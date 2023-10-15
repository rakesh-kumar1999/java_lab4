package Lab_4;
import java.util.*;
/*WAP to compute following using Array find the largest even number and smallest odd number in an array of 10 numbers */
 public class Even_Odd{
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
        int even_Largest=0;
        for(int i=(arr.length-1);i>0;i--){
            if(arr[i]%2==0){
                even_Largest=arr[i];
                break;
            }
        }
        int odd_Smallest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                odd_Smallest=arr[i];
                break;
            }
        }
        System.out.println("Largest even number: "+even_Largest+"\nSmallest odd number: "+odd_Smallest);
        sc.close();
    }
 }