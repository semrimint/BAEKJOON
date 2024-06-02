import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 배열 수
        int cnt = 0; // 개수기
        int[] arr = new int[n+1]; // 배열 수 n개 선언
        for(int i = 1 ; i <= n ; i++){
            arr[i] = in.nextInt();
        }
        int a = in.nextInt();

        for(int i = 1 ; i <= n ; i++){
            if(arr[i] == a){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}