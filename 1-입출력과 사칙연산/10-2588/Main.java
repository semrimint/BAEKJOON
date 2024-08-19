import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();

        for(int n = b;n>0;n/=10){
            System.out.println(a*(n%10));
        }
        System.out.print(a*b);

        in.close();
    }
}