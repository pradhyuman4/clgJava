public class assg2_que17 {
    public static void main(String[] args) {
        int p = 2415;
        int sum = 0;
        while(p!=0){
            int r = p%100;

            if(r>9) sum += r;

            p/=10;
        }
        System.out.println(sum);
    }
    }

