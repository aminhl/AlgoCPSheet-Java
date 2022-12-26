import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i <n ; i++)
            for (int j = 0; j <n ; j++)
                arr[i][j] = sc.nextInt();
        int p1=0, p2=n-1;
        int lD=0, rD=0;
        for (int i = 0; i <n ; i++){
            lD += arr[p1][p1];
            rD += arr[p1][p2];
            ++p1;
            --p2;
        }
        System.out.println(Math.abs(lD-rD));
    }
}