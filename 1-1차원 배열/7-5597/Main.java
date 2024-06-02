import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[31];
        for(int i=1;i<=28;i++){
            int a = in.nextInt();
            array[a]=1;
        }
        for(int i=1;i<=30;i++){
            if(array[i]!=1)
                System.out.println(i);
        }
        in.close();
    }
}