class sum6{
    void sum(int a, int b){
        System.out.println("the sum of two number is " + (a+b));
    };

    void sum(int a, int b, int c){
        System.out.println("the sum of three numbers is " + (a+b+c)) ;
    }

}

public class assg2_que6 {
    public static void main(String[] args) {
        sum6 s = new sum6();
        s.sum(1,2);
        s.sum(1,2,3);
    }
}
