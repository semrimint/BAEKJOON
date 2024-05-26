import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] array = new int[a];
        for(int i = 0;i<a;i++){
            array[i]=i+1;
        }
        for(int i=1;i<=b;i++){
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            int temp = array[x];
            array[x] = array[y];
            array[y] = temp;
        }
        for(int i : array)
            System.out.print(i+" ");
        in.close();
    }
}