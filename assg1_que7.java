import java.util.Scanner;

public class assg1_que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float percentage = sc.nextFloat();

        if(percentage >= 90){
            System.out.println("grade A");
        }
        if(percentage >= 80){
            System.out.println("grade B");
        }
        if(percentage >= 70){
            System.out.println("grade C");
        }
        if(percentage >= 60){
            System.out.println("grade D");
        }
        if(percentage >= 40){
            System.out.println("grade E");
        }
        else{
            System.out.println("grade F");
        }
    }
}
