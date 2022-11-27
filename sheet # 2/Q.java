import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            int x = sc.nextInt();
            if (x == 0) System.out.print("0");
            while (x != 0){
                System.out.print(x%10 + " ");
                x /= 10;
            }
            System.out.println();
        }
    }
}