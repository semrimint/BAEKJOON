import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 변수 및 객체 선언
        Scanner in = new Scanner(System.in);
        boolean[][] paper = new boolean[101][101];

        // 처리
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            for(int a = x; a < x+10; a++){
                for(int b = y; b < y+10; b++){
                    paper[a][b] = true;
                }
            }
        }

        // 넓이값 출력
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            for(int j = 1; j <= 100; j++) {
                if(paper[i][j]) sum++;
            }
        }
        System.out.println(sum);
        in.close();
    }
}