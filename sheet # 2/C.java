import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int even, odd, neg, pos;
        even = odd = neg = pos = 0;

        while (n-- > 0) {
            int x = scanner.nextInt();
            if (x > 0) ++pos;
            else if (x < 0) ++neg;
            if (x % 2 == 0) ++even;
            else if (x % 2 != 0) ++odd;
        }
        System.out.println("Even: " + even + "\nOdd: " + odd + "\nPositive: " + pos + "\nNegative: " + neg);
    }
}