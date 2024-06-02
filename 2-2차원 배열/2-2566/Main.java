import java.util.Scanner;

class Max{
    int x;
    int y;
    int num=-1;
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Max max = new Max();
        int[][] arr = new int[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = in.nextInt();
                if(arr[i][j]>=max.num){
                    max.num = arr[i][j];
                    max.x = i+1;
                    max.y = j+1;
                }
            }
        }
        System.err.println("test");
    
        in.close();
    }
}