import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            short n = sc.nextShort();
            short m = sc.nextShort();
            if (n<=0 || m<=0) break;
            long sum = 0;
            for (int i = Math.min(n,m); i <= Math.max(n,m) ; i++) {
                sum += i;
                System.out.print(i + " ");
            }
            System.out.println("sum =" + sum);
        }

    }
}