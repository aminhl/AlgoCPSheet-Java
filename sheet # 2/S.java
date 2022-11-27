import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            long sum = 0;
            for (int i = Math.min(x,y)+1; i < Math.max(x,y) ; i++)
                if (i%2 != 0) sum += i;
            System.out.println(sum);
        }
    }
}