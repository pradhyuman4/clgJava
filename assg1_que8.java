import java.util.Scanner;

public class assg1_que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println();
        int b = sc.nextInt();

        if(a % b == 0){
            System.out.println("a is divisible by b");
        }
        else{
            System.out.println("a is not divisible by b");
        }
    }
}
