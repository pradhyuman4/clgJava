class p{
    void greet1(){
        System.out.println("i am a base class");
    }
}
class q extends p{
    void greet2(){
        System.out.println("i am derived from class p");
    }
}
class r extends q{
    void greet3(){
        System.out.println("i am derived from class q or i extends class q");
        System.out.println("this is multilevel inheritance");
    }
}

public class assg2_que13 {
    public static void main(String[] args) {
        r r2 = new r();
        r2.greet1();
        r2.greet2();
        r2.greet3();
    }
}
