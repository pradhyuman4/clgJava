import java.util.Scanner;

public class assg1_que11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int r=0;
        while (n>0){
            int ld = n%10;
            r=r*10+ld;
            n/=10;
        }
        System.out.print(r);
    }
}
