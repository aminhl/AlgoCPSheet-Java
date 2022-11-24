import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean flag = false;
        for (int i = n; i <= m ; i++) {
            boolean lucky = true;
            int dummy = i;
            while (dummy != 0){
                if (dummy%10 != 4 && dummy%10 != 7) {
                    lucky = false;
                    break;
                }
                dummy /= 10;
            }
            if (lucky) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if (!flag) System.out.println("-1");
    }
}