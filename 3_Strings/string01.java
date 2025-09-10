import java.util.*;
public class string01 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name=sc.nextLine();
        // System.out.println("Your name is:"+ name);
        String firstname="Subham";
        String secondname="gudu";
        String finalname=firstname +"@" +secondname;
        System.out.println("finalname :"+finalname);
        System.out.println(finalname.length());
        for(int i=0;i<finalname.length();i++){
            System.out.println(finalname.charAt(i));
        }

    }
}
