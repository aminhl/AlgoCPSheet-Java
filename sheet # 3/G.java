import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) arr[i] = sc.nextInt();
        int p1=0,p2=n-1;
        boolean is_palindrome=true;
        for (int i = 0; i <n ; i++) {
            if (arr[p1] != arr[p2]){
                is_palindrome = false;
                break;
            }
            ++p1;
            --p2;
        }
        System.out.println(is_palindrome ? "YES" : "NO");
    }
}