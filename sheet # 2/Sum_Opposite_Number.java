import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, dummy = n, numOfDigits = 0;
        while (dummy != 0) {
            rev = rev * 10 + dummy % 10;
            dummy /= 10;
            ++numOfDigits;
        }
        for (int i = 0; i < (numOfDigits + 1)/2; i++) {
            System.out.println(rev%10 + n%10);
            n /=10;
            rev /= 10;
        }
    }
}