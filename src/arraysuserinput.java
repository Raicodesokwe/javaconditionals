import java.util.Scanner;

public class arraysuserinput {
    public static void main(String[] args) {
        Scanner chukua;
        String[] students;
        Integer numberofstudents;

        chukua=new Scanner(System.in);
        //get number of students from user
        System.out.println("How many students do you have?");
        numberofstudents=chukua.nextInt();

        //instantiate your string array with

        students=new String[numberofstudents];
        System.out.println("Enter the names");
        //loop to get names from the user
        for (int x=0;x<numberofstudents;x++){
            students[x]=chukua.next();
        }
        //write the loop to print the received names
        for (int x=0;x<numberofstudents;x++){
            System.out.println(students[x]);
        }
    }
}
