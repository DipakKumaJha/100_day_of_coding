import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int array[]=new int [5];
        int key;
        int found=0;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Number..-:");
            array[i]=in.nextInt();
        }
        System.out.println("Enter Search Number..-:");
        key=in.nextInt();
        for(int i=0;i<5;i++)
        {
            if(array[i]==key)
            {

                System.out.print("Found This Number..-:"+(i+1));
                found=1;
                break;
           }        
        }
        
       
    }
}
