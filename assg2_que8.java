class father1{
    public static void eat(){
        System.out.println("eat at 2 pm");
    }
}

class son extends father1{
    public static void eat(){
        System.out.println("eat at 12 pm");
    }
}



public class assg2_que8 {
    public static void main(String[] args) {
        son s = new son();
        father1 f2 = new son();
       // s.eat();   --- > not allowed
        f2.eat();


    }
}
