import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n ; i++) {
            long sumOfDigits = 0;
            int dummy = i;
            while (dummy != 0){
                sumOfDigits += dummy%10;
                dummy /= 10;
            }
            if (sumOfDigits >= Math.min(a,b) && sumOfDigits <= Math.max(a,b)) sum += i;
        }
        System.out.println(sum);
    }
}