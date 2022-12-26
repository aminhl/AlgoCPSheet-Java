import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i <n ; i++)
            for (int j = 0; j <m ; j++)
                arr[i][j] = sc.nextInt();
        int key = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i <n ; i++)
            for (int j = 0; j <m ; j++){
                if (arr[i][j] == key){
                    flag = true;
                    break;
                }
            }
        System.out.println(flag ? "will not take number" : "will take number");
    }
}