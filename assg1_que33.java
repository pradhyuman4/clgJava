class Commission {
    private final float sales;
    Commission(float sales){
        this.sales = sales;
    }
    void commission(){
        if(sales<=0){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("The commission for sales: "+sales+" is ");

        float c=(sales*2)/100;
        System.out.println(c);
    }
}


public class assg1_que33 {

    public static void main(String[] args) {
        Commission c = new Commission(65000);
        c.commission();

    }
}
