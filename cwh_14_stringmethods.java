import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class cwh_14_stringmethods {
    public static void main(String[] args) {
        String name = "HARRY";
        //int value = name.length();
        //System.out.println(name);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //System.out.println(value);

        //String nonTrimmedstring = "     harry     ";
        //System.out.println(nonTrimmedstring);

        //String trimmedstring = nonTrimmedstring.trim();
        //System.out.println(trimmedstring);


        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('R','P'));
        //System.out.println(name.replace("RRY","IER"));

        //System.out.println(name.startsWith("HAR"));
        //System.out.println(name.endsWith("RY"));

       // System.out.println(name.charAt(0));
      //  System.out.println(name.charAt(1));
        //System.out.println(name.charAt(2));
        //System.out.println(name.charAt(3));
        //System.out.println(name.charAt(4));

//        System.out.println(name.indexOf("RRY"));
        //String modifiedname = "harry";
        //System.out.println(modifiedname.indexOf("rry",4));
       // System.out.println(modifiedname.lastIndexOf("r",2));

        System.out.println(name.equals("HARRY"));
        System.out.println(name.equalsIgnoreCase("haRRy"));

        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \t double quote");
    }
}
