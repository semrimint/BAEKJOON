import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] array = new int[a];
        for(int i=0;i<b;i++){
            int nim = in.nextInt();
            int max = in.nextInt();
            int n = in.nextInt();
            for(int j = nim;j<=max;j++){
                array[j-1]=n;
            }
        }
        
        for(int i:array){
            System.out.print(i+" ");
        }
        in.close();
    }
}