import java.util.*;
public class bubblesort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the element:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }

        }
        System.out.println("sorted array after ascending:");
        for(int i=0;i<num;i++){
            System.out.print(arr[i] + " ");
        }
        


    }
}
