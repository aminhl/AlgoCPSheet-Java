import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        short n = sc.nextShort();
        while (n-- > 0){
            int x = sc.nextInt();
            for (int i = 0; i < x; i++) System.out.print(c);
            System.out.println();
        }
    }
}