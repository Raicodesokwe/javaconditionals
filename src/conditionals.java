public class conditionals {
    public static void main(String[] args) {
        Integer age;
        age=18;
        if(age<18){
            System.out.println("You haven't qualified to register");
        }else{
            System.out.println("You have qualified to register");
        }

        //this is an else if statement

        Integer a,b;
                a=43;
                        b=43;
                        if(a<b){
                            System.out.println("a is less than b");
                        }else if(a>b){
            System.out.println("a is greater than b ");
        }else{
            System.out.println("They are equal");
        }
                        Integer bet;
                        bet=10000;
                        switch (bet){
                            case 0:
                                System.out.println("Enter a number from one negro");
                                break;
                            case 1:
                                System.out.println("Shit negro you won");
                                break;
                            case 2:
                                System.out.println("Unlucky nigga");
                                break;
                            case 3:

                                System.out.println("That ain't it bro");
                                break;
                                default:
                                    System.out.println("Sare jo");
                        }
    }
}
