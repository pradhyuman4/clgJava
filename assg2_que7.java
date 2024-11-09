//method overriding

class X{
    void eat(){
        System.out.println("eat at 10 pm");
    }
}

class Y extends X{
    void eat(){
        System.out.println("eat at 5 pm");
    }
}

public class assg2_que7 {
    public static void main(String[] args) {
        Y y = new Y();
        X x = new Y();
        y.eat();
        x.eat();
    }
}
