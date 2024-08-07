import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int noOfguesses = 0;

//    public int getNoOfguesses() {
//         return noOfguesses;
//     }
//
//     public void setNoOfguesses(int noOfguesses) {
//         this.noOfguesses = noOfguesses;
//     }

     game(){
        Random rd = new Random();
        this.number= rd.nextInt(100);
    }

    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean iscorrectnumber(){
        noOfguesses++;
        if (inputnumber == number){
            System.out.format("yes you guessed it right, it was %d\n you guesed it in %d atempts ", number, noOfguesses);
            return true;
        }
        else if (inputnumber<number) {
            System.out.println("too low....");
        }
        else if (inputnumber>number) {
            System.out.println("too high...");

        }
        return false;

    }

 }

public class CWH_50_ex3_guessnumber {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b) {
            g.takeuserinput();
            b = g.iscorrectnumber();

        }
    }
}
