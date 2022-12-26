import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cp = new int[n];
        for (int i = 0; i <n ; i++) arr[i] = sc.nextInt();
        for (int i = 0; i <n ; i++) cp[i] = sc.nextInt();
        Arrays.sort(arr);
        Arrays.sort(cp);
        System.out.println(Arrays.equals(arr,cp) ? "yes" : "no");
    }
}