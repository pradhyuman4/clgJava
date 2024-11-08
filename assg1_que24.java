import java.util.Scanner;

public class assg1_que24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int sum=0;

        int []arr=new int[n];

        System.out.println("Enter entries of array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        System.out.println("sum is "+sum);

        System.out.println("average is "+sum/n);
    }
}
