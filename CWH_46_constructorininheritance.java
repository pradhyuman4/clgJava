//constructors in inheritance
class base1 {
    base1() {
        System.out.println("i am a constructor");
    }

    base1(int x) {
        System.out.println("i am a overloaded constructor with value of x is: " + x);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived1 extends base1 {

    derived1(){
        //super(0);
        System.out.println("i am a derived class constructor");
    }
    derived1(int x, int y) {
        super(x);
        System.out.println("i am a overloaded constructor with value of y is: " + y);
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class childofderived  extends derived1{
    childofderived(){
        System.out.println("i am a child of derived consructor");
    }
    childofderived(int x, int y, int z){
        super(x,y);
        System.out.println("i am a overeloaded  constructor of childofderived with value of z as: "+z);
    }
}
public class CWH_46_constructorininheritance {
    public static void main(String[] args) {
        //base1 b = new base1();
       // derived1 d = new derived1();\
       // derived1 d = new derived1(14, 9);
        //childofderived cd = new childofderived();
        childofderived cd = new childofderived(12, 13 , 15);


    }

}