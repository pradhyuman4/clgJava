import  java.util.Scanner;

public class assg1_que16 {

    static int hcf(int a, int b){
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 numbers ");

        int x= sc.nextInt();
        int y= sc.nextInt();

        System.out.println("The hcf of "+x+" and "+y+" is "+hcf(x,y));
    }
}
