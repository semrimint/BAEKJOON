import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int min = 1000000;
        int max = -1000000;
        for(int i:arr){
            if(i < min){
                min = i;
            }
        }
        for(int i:arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(min + " " + max);
    }
}