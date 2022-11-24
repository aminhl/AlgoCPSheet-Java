import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-- > 0){
            int x = scanner.nextInt();
            long fact = 1;
            for (int i = 1; i <= x ; i++) fact *= i;
            System.out.println(fact);
        }
    }
}