import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            int nb = sc.nextInt();
            int arr[] = new int[nb];
            for (int i = 0; i <nb ; i++) arr[i] = sc.nextInt();
            int minSum= arr[0]+arr[1]+1;;
            for (int i = 0; i <nb ; i++){
                for (int j = i+1; j <nb ; j++) {
                    int target = arr[i]+arr[j]+j-i;
                    if (target < minSum) minSum = target;
                }
            }
            System.out.println(minSum);
        }
    }
}