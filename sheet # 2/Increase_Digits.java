import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dummy = n, rev = 0, numOfDigigts = 0;
        while (dummy != 0){
            int x = dummy%10;
            ++x;
            if (x == 10) x = 0;
            rev = rev*10 + x;
            dummy /= 10;
            ++numOfDigigts;
        }

        while (rev != 0){
            System.out.print(rev%10);
            rev /= 10;
            --numOfDigigts;
        }
       while (numOfDigigts-- > 0){
           System.out.print("0");
       }
    }
}