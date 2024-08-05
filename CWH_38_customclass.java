
 class Employee{
    int id;
    String name;
 }
public class CWH_38_customclass {
    public static void main(String[] args) {
        System.out.println("this is a  custom class");
        Employee harry = new Employee(); //instanstiating a new emplyee object
        // setting attributes
        harry.id = 12;
        harry.name= "code with harry";
        System.out.println(harry.id);
        System.out.println(harry.name);
    }
}
