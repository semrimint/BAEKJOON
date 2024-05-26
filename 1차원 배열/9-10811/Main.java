import java.util.Scanner;

public class Main {

    static int[] arr = new int[100];

    static void Swap(int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i = 1;i<=n;i++){
            arr[i-1] = i;
        }

        for(int i = 1;i<=m;i++){
            int start = in.nextInt()-1;
            int end = in.nextInt()-1;
            while(start<end){
                Swap(start,end);
                start++;
                end--;
            }
        }

        for(int i=0;i<=(n-1);i++)
            System.out.print(arr[i]+" ");

        in.close();
    }
}