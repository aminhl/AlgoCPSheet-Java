import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        while (n-- > 0){
            int x = scanner.nextInt();
            if (x > max) max = x;
        }
        System.out.println(max);
    }
}