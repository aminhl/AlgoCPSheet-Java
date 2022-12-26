import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        while (q-- > 0){
            int key = sc.nextInt();
            int l=0,h=n-1;
            boolean found = false;
            inner:while (l<=h){
                int m = (l+h)/2;
                if (arr[m] == key){
                    found = true;
                    break inner;
                }
                else if (arr[m] > key) h = m-1;
                else l = m+1;
            }
            System.out.println(found ? "found" : "not found");
        }
    }
}