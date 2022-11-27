import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0, second = 1;
        if (n == 1) System.out.println(start);
        else if (n == 2) System.out.print(start + " " + second);
        else {
            System.out.print(start + " " + second + " ");
            for (int i = 2; i < n ; i++) {
                int res = start + second;
                System.out.print(res + " ");
                start = second;
                second = res;
            }
        }
    }
}