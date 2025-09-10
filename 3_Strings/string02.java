import java.util.*;
public class string02 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st name:");
        String name1=sc.nextLine();
        System.out.println("Enter 2nd name:");
        String name2=sc.nextLine();

        if(name1.compareTo(name2)==0){
            System.out.println("names are equal");
            
        }
        else{
            System.out.println("names are not equal");
        }

    }
}
