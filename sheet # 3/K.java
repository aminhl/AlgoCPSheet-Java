import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s.split("");
        long sum=0;
        for (int i = 0; i <s.length() ; i++) sum+= (int) s.charAt(i) - (int)'0';
        System.out.println(sum);
    }
}