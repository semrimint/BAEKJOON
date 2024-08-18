import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n*2][m];

        for(int i=0;i<n*2;i++)
            for(int j = 0;j<m;j++)
                arr[i][j] = in.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+arr[i+n][j]+" ");
            }
            System.out.println();
        }

        in.close();
    }
}