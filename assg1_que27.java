import java.util.Scanner;

public class assg1_que27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<n-1; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
