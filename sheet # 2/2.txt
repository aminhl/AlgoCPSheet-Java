import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int flag = 0;
        for (int i = 1; i <= n; i++)
            if (i%2 == 0) {
                System.out.println(i);
                ++flag;
            }
        if (flag == 0) System.out.println("-1");
    }
}