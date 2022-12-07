import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < n; i++){
            if (arr[i] == target){
                found = true;
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

}