import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rev = 0, dummy = n;
        while(dummy !=0){
            rev = rev*10 + dummy%10;
            dummy /= 10;
        }
        if (rev == n) System.out.println(rev + "\nYES");
        else  System.out.println(rev + "\nNO");
    }
}