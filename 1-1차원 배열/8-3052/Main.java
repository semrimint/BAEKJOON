import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        HashSet<Integer> set = new HashSet<Integer>();
        int cnt = 0;

        for(int i = 1 ; i<=10 ; i++){
            int a = in.nextInt();
            set.add(a%42);
        }
        for(int i : set){
            cnt++;
        }
        System.out.println(cnt);

        in.close();
    }
}