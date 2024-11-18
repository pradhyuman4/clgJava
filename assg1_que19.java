import java.util.Scanner;

public class assg1_que19 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("enter a number ");
        String x= sc.next();

        x = x.toLowerCase();

        int start=0;
        int end=x.length()-1;

        while (start<end){
            if (x.charAt(start)==x.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println(" number is not a palindrome.");
                return;
            }
        }
        System.out.println("number is a palindrome.");
    }
}
