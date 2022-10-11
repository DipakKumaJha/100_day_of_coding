import java.util.Scanner;
public class MergeArray {
    public static void main(String [] arge)
    {
        int  FirstArray[]=new int [5];
        int SecondAraay[]=new int [5];
        int FinalArray[]=new int [FirstArray.length+SecondAraay.length];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter First Element ....->");
            FirstArray[i]=in.nextInt();
            System.out.print("Enter Second Element....->");
            SecondAraay[i]=in.nextInt();
        }
        for(int i=0;i<FirstArray.length;i++)
        {
            FinalArray[i]=FirstArray[i];
            
        }
        int j=0;
        for(int i=5;i<FinalArray.length;i++)
        {
            FinalArray[i]=SecondAraay[j];
            j++;
        }
        for(int i=0;i<FinalArray.length;i++)
        {
            System.out.println(FinalArray[i]);
            
        }       
    }
}
