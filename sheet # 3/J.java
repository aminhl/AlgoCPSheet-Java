import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int min = arr[0];
        int count = 0;
        for (int e: arr)
            if (e == min) ++count;
        System.out.println(count%2!=0 ? "Lucky":"Unlucky");
    }
}