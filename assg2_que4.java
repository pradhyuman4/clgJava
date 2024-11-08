class cuboid{
    cuboid(int length){
        System.out.println("the length  is " + length);
    }
    cuboid(int length, int breadth ){
        System.out.println("the area is " + length*breadth);
    }
    cuboid(int length, int breadth , int height){
        System.out.println("the volume is " + length*breadth*height);
    }
}

public class assg2_que4 {
    public static void main(String[] args) {
        cuboid c = new cuboid(1);
        cuboid r = new cuboid(1,2);
        cuboid d = new cuboid(1,2,3);
    }
}
