import java.util.*;

public class Recursion2 {
    public static void towerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerofHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerofHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num = sc.nextInt();
        towerofHanoi(num, "S", "H", "D");
    }
}
