class car{
    String carname;
    String brandname;

    car(String carname, String brandname){
        this.carname = carname;
        this.brandname = brandname;
    }
   public void ShowDetailsOfCar(){
        System.out.println("the "+carname + " is of " + brandname + " brand");
    }
}

public class assg2_que15 {
    public static void main(String[] args) {

    car c = new car("dzire", "maruti suzuki");
    c.ShowDetailsOfCar();

}
}
