import java.util.Scanner;
class Largest
{
    int a[]=new int[5];
    int max=0;
    void read()
    {   
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Number..->>");
            a[i]=in.nextInt();
        }
    }
    void findlargest()
    {
        for(int i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("***************************");
        System.out.println("Biggest Number Is ........->"+max);
    }
}
public class LargestArray {
    public static void main(String[] args) {
        Largest lrg=new Largest();
        lrg.read();
        lrg.findlargest();
    }
}
