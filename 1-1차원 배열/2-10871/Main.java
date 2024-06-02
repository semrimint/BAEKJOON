import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = in.nextInt();
            if (a < m) {
                System.out.print(a+" ");
            }
        }
    }
}