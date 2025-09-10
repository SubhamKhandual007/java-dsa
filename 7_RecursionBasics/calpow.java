import java.util.*;
public class calpow {
    public static int printcal(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==1){
            return 0;
        }
        int xpownm1=printcal(x, n-1);
        int xpow=x*xpownm1;
        return xpow;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of x:");
            int x=sc.nextInt();
            System.out.println("Enter the value of n:");
            int n=sc.nextInt();
            int ans=printcal(x, n);
            System.out.println(ans);
            

        }

    }
    

