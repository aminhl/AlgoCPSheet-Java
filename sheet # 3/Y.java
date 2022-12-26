import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int[] acc = new int[n];
        for (int i = 0; i <n ; i++){
            arr[i] = sc.nextInt();
            acc[i] += (i==0) ? arr[i] : acc[i-1]+arr[i];
        }
        while (q-->0){
            int s = sc.nextInt();
            int e = sc.nextInt();
            --s;
            --e;
            System.out.println(acc[e]-acc[s]+arr[s]);
        }
    }
}