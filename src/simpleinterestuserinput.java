import java.util.Scanner;

public class simpleinterestuserinput {
    public static void main(String[] args) {
        Scanner oya;
        Double p,r,t,interest;
        oya=new Scanner(System.in);
        System.out.println("Enter the principle");
        p=oya.nextDouble();
        System.out.println("Enter the rate in Percentage");
        r=oya.nextDouble();
        System.out.println("Enter the number of years");
        t=oya.nextDouble();

        interest=p*r*t/100;
        System.out.println("The interest is "+interest);
    }
}
