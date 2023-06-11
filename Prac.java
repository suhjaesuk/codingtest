import java.util.Arrays;
import java.util.Scanner;

public class Prac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = scanner.nextInt();
        }

        Arrays.sort(times);
        int sumTime = 0;
        int totalTime = 0;
        for(int time : times) {
            sumTime += time;
            totalTime += sumTime;
        }

        System.out.println(totalTime);
    }
}
