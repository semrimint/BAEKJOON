import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = in.nextInt();
        int max = 0;
        double sum = 0;
        double[] arr = new double[n];

        // 입력 및 처리
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
            if (arr[i] > max)
                max = (int) arr[i];
        }
        for(int i = 0; i < n; i++){
            sum += (arr[i]/max)*100;
        }

        // 출력
        System.out.println(sum/n);

        in.close();
    }
}