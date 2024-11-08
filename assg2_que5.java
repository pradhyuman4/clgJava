class father{
    void greet(){
        System.out.println("namaskar ");
    }
}

class child extends father{
    void greetc(){
        System.out.println("helloo");
    }
}

public class assg2_que5 {
    public static void main(String[] args) {
        child c = new child();
        c.greetc();
        c.greet();
    }
}
