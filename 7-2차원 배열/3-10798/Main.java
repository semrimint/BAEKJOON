import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Line;
        char[][] arr = new char[5][15];
        int max = 0;
        for(int i=0;i<5;i++){
            Line = in.nextLine();
            if(max<Line.length()) max=Line.length();
            for(int j=0;j < Line.length();j++){
                arr[i][j] = Line.charAt(j);
            }
        }
        for(int i = 0;i < max;i++){
            for(int j = 0; j < 5;j++){
                if(arr[j][i]!='\0') System.out.print(arr[j][i]);
            }
        }
        in.close();
    }
}