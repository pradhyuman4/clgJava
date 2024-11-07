public class assg1_que12 {
    public static void main(String[] args) {
        Marks m = new Marks(25,26,94);

        m.evaluate();
    }
}
class Marks{
    float mathsMarks;
    float physicsMarks;
    float chemistryMarks;

    Marks(float a,float b,float c){
        mathsMarks=a;
        physicsMarks=b;
        chemistryMarks=c;
    }

    void evaluate(){
        float total= mathsMarks+physicsMarks+chemistryMarks;
        System.out.println("Total marks are "+total);
        if (mathsMarks<60){
            System.out.println("rejected");

        }
        if (physicsMarks<50){
            System.out.println("rejected");

        }
        if (chemistryMarks<40){
            System.out.println("Reject because you failed in chemistry and Now its doesn't" +
                    " matter your total is greater than 200");
        }
        if(total<200){
            System.out.println("rejected");
            return;
        }
        else{
            System.out.println("you are admitted ");
        }
    }
}
