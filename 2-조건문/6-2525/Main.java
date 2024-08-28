import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();
        int time = in.nextInt();

        h+=(m+time)/60;
        m+=time;
        
        if(m>=60){
            while(m>=60)
                m-=60;
            if(h>=24)
                h-=24;
        }

        System.out.println(h+" "+m);

        in.close();
    }
}