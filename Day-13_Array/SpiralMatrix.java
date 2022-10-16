import java.util.Scanner;
class Spiral {
    private static int max=3,min=3;
    private int[][] array=new int[max][min];

    public void read() {
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<max; i++) {
            for (int j=0; j<min; j++) {

                System.out.print("Enter Element of an Array :-");
                array[i][j]= sc.nextInt();
            }
        }
    }

    public void spiral() {
        System.out.println("Spiral of a Matrix");
        int rowStart=0;
        int rowEnd=max-1;
        int colStart=0;
        int colEnd=min-1;

        while(rowStart<=rowEnd && colStart<=colEnd) {
            for (int col=colStart; col<=colEnd; col++) {
                System.out.print(array[colStart][col]+", ");
            }
            rowStart++;
            for (int row=rowStart;row<=rowEnd;row++) {
                System.out.print(array[row][colEnd] + ", ");
            }
            colEnd--;
            for (int col=colEnd; col>=colStart; col--) {
                System.out.print(array[rowEnd][col] + ", ");
            }
            rowEnd--;
            for (int row=rowEnd; row>=rowStart; row--) {
                System.out.print(array[row][colStart] + ", ");
            }
            colStart++;
        }
    }
}

public class SpiralMatrix {
    public static void main(String[] args) {
        Spiral s=new Spiral();
        s.read();
        s.spiral();        
    }
}
