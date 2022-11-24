import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
           int x = scanner.nextInt();
            if (x == 1999){
                System.out.println("Correct");
                break;
            }
            else System.out.println("Wrong");
        }
    }
}