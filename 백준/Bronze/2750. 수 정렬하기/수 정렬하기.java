import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer [] arr = new Integer[n];
        for (int i = 0; i < n; i++){
            int temp = scanner.nextInt();
            arr[i] = temp;
        }
        Arrays.sort(arr);
        for (int a : arr){
            System.out.println(a);
        }
    }
}