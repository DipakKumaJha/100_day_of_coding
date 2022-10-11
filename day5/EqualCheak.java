import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
class Equal
{
    int a[]=new int [5];
    int b[]=new  int[5];
   
    Scanner in=new Scanner(System.in);
    void read()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Number Of A Array...->");
            a[i]=in.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Number Of B Array..->");
            b[i]=in.nextInt();
        }
    
       
           boolean result =Arrays.equals(a,b);
             if (result==true)
             {
                System.out.println("Two Array is Equal..");
            }
            else 
              System.out.println("Two Arayy is not Equal..........");  
            
           
    }
}
public class EqualCheak
{
    public static void main(String[] args) {
        Equal eql=new Equal();
        eql.read();
       //eql.sum();
    }
}
