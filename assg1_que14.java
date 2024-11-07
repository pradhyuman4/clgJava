import java.util.Scanner;

public class assg1_que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 1; i<= n; i++){
            if(i%10 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
