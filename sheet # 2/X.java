import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x-- > 0){
            int n = sc.nextInt();
            int ones = 0;
            while (n != 0){
                if (n%2 == 1) ++ones;
                n /= 2;
            }
            double result = 0;
            for (int i = 0; i < ones ; i++) result += Math.pow(2,i);
            System.out.println((int) result);
        }
    }
}