import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) arr[i] = sc.nextInt();
            int counter = 0;
            for (int i = 0; i <n ; i++)
                for (int j = i+1; j <n ; j++){
                    if (arr[j-1] < arr[j]) ++counter;
                    else break;
                }
            System.out.println(counter+n);
        }
    }
}