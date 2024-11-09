//static keyword

class counter {

    static int count = 0;


    counter() {
        count++;
    }
     void displayCount() {
        System.out.println("Total count: " + count);
    }
}


public class assg2_que16 {
    public static void main(String[] args) {
        counter c1 = new counter();
        c1.displayCount();
        counter c2 = new counter();
        c2.displayCount();
        counter c3 = new counter();
        c3.displayCount();
    }
}
//count will increase after everytime we create a object
