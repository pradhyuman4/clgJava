public class CWH_34_recursion {

    //factorial(0) = 1
    //factorial (n) = n * (n-1) * ....
    static int factorial(int n){
        if (n == 0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 0;

        System.out.println("the value of factorial n is " + factorial(n));

    }
}
