import java.util.*;
public class sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter elements :");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num-1;i++){
            int smallest=i;
            for(int j=i+1;j<num;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
              int temp=arr[smallest];
              arr[smallest]=arr[i];
              arr[i]=temp;
        }
        System.out.println("sorted array in ascending order:");
        for(int i=0;i<num;i++){
            System.out.println(arr[i] + " ");
        }
      

    }
}
