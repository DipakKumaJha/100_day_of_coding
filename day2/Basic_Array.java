import java.util.Scanner;

//import org.omg.CORBA.SystemException;
public class Basic_Array {
    public static void main(String[] args) {
        int a[]=new int[10];
        
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter number..->");
            a[i]=in.nextInt();
        }
        
      
   
   for(int i=0;i<10;i++){
    System.out.println(a[i]);}
        
    }
}
