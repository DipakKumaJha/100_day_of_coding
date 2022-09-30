import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int m;
        int n;
        int t;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter M Number..-:");
        m=in.nextInt();
        System.out.print("Enter N number..-:");
        n=in.nextInt();
        t=m;
        m=n;
        n=t;
        System.out.println("Value of  M is.."+m+ "Value of N is"+n);
        System.out.println("Swap Value..-:"+m+" "+n);
    }
}
