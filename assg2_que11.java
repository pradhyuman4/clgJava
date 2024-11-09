class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number ->" + number);
    }
}

class HexNum extends Num {


    public HexNum(int number) {
        super(number);
    }


    @Override
    public void showNum() {
        System.out.println("Hexadecimal ->" + Integer.toHexString(number).toUpperCase());

        System.out.println("Octal -> " + Integer.toOctalString(number));
    }
}

public class assg2_que11 {

    public static void main(String[] args) {
        Num n = new Num(960);
          n.showNum();

        HexNum h = new HexNum(100);
          h.showNum();


    }
}
