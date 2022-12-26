import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            int nb = sc.nextInt();
            int[] arr = new int[nb];
            for (int i = 0; i < nb; i++) arr[i] = sc.nextInt();
            for (int s = 0; s <nb ; s++) {
                int max = arr[s];
                for (int e = s; e <nb ; e++) {
                    for (int i = s; i <= e ; i++) if (arr[i] > max) max = arr[i];
                    System.out.print(max + " ");
                }
            }
            System.out.println();
        }
    }
}