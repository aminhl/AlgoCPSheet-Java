import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) arr[i] = sc.nextInt();
        int counter = 0;
        main:while (true){
            for (int i = 0; i <n ; i++) {
                if (arr[i]%2 == 0)
                    arr[i] /= 2;
                else break main;
            }
            ++counter;
        }
        System.out.println(counter);
    }
}