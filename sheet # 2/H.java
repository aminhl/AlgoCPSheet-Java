import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i <= n/2 ; i++){
            if (n%i == 0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "YES" : "NO");
    }
}