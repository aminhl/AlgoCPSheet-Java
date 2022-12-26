import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) arr[i] = sc.nextInt();
        int[] cp = Arrays.copyOf(arr,n);
        Arrays.sort(cp);
        int min = cp[0], max = cp[cp.length-1];
        for (int i = 0; i <n ; i++) {
            if (arr[i] == min) arr[i] = max;
            else if (arr[i] == max) arr[i] = min;
        }
        for (int e : arr) System.out.print(e + " ");
    }
}