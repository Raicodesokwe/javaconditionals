import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner chukua;
        Integer x,y,jibu;
        chukua=new Scanner(System.in);
        System.out.println("Enter the value for x");
        x=chukua.nextInt();
        System.out.println("Enter the value for y");
        y=chukua.nextInt();
        jibu=x+y;
        System.out.println("Your answer is "+jibu);
    }
}
