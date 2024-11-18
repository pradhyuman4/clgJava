import java.util.Scanner;

public class assg1_que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = false;
        if(n == 0 || n == 1){
            b = true;
        }
        for(int i = 2; i<=n/2; i++){


            if(n % i == 0){
                b = true;
                break;
            }

        }
        if(!b){
            System.out.println("it is prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
    }
}
