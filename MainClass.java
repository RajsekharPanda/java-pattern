import java.util.Scanner;

public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       
        int total;
        int count=1;
        int rowStart=0;
        int colStart=0;
    
        int round;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        int row=n;
        int col=n;
        int rowEnd=row-1;
        int colEnd=col-1;
        int [][]arr = new int [row][col];
        total=row*col;
        round=1;
        while (count<=total) {
            if (round%2!=0) {
                for(int i=rowStart; i<=rowEnd; i++){
                    if(count>total)
                    {
                        break;
                    }
                    arr[i][colStart]=count;
                    count++;
                }
                colStart++;
                for(int i=colStart; i<=colEnd; i++){
                    if (count>total) {
                        break;
                    }
                    arr[rowEnd][i]=count;
                    count++;
                }
                rowEnd--;
                for (int i = rowEnd; i >=rowStart ; i--) {
                    if (count>total) {
                        break;
                    }
                    arr[i][colEnd]=count;
                    count++;
                }
                colEnd--;
            }
            else{
                for (int i = rowStart; i <= rowEnd; i++) {
                    if (count>total) {
                        break;
                    }
                    arr[i][colEnd]=count;
                    count++;
                }
                colEnd--;
                for (int i = colEnd; i >=colStart; i--) {
                    if (count>total) {
                        break;
                    }
                    arr[rowEnd][i]=count;
                    count++;
                }
                rowEnd--;
                for (int i = rowEnd; i >= rowStart; i--) {
                    if (count>total) {
                        break;
                    }
                    arr[i][colStart]=count;
                    count++;
                }
                colStart++;
            }
            round++;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
