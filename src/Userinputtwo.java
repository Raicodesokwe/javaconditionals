import java.util.Scanner;

public class Userinputtwo {
    public static void main(String[] args) {
        Scanner ingiza;
        Double y,z,jibu;
        int w;
        //instantiate your Scanner
        ingiza=new Scanner(System.in);
        //get data from the user using scanner
        System.out.println("Enter the value for y");
        y=ingiza.nextDouble();
        if(y instanceof Double){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println("Enter the value for z");
        z=ingiza.nextDouble();
        jibu=y+z;
        System.out.println("Your answer is "+jibu);
    }
}
