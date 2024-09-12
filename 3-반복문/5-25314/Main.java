import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int n = (a / 4) + ((a % 4) > 0 ? 1 : 0);
        for (int i = 1; i <= n; i++) {
            System.err.print("long ");
        }
        System.err.print("int");

        in.close();
    }
}