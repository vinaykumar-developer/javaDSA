//max of 3 no using inbuild functions 
// package function.Method();
import java.util.Scanner;
public class f1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nummbers a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.min(Math.min(a, b),c));
    }
    
}
