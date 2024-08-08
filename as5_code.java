class ABC{
    int a = 10;  float f = 15f; int c = 0;
    void abc(){
        int c =15;  int d =10; 
        d= d+c;
    }
 //c = c + 1;

}
public class as5_code {
public static void main(String[] args) {
    ABC g =new ABC();
    System.out.println(g.c);
    // System.out.println(g.d);
}
    
}
//we cant assign the value to c without using setter