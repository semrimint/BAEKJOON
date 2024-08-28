import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        m-=45;
        if(m<0){
            h-=1;
            m+=60;
            if(h<0){
                h+=24;
            }
        }
        System.out.println(h+" "+m);

        in.close();
    }
}