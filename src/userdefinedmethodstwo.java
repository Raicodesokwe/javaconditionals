public class userdefinedmethodstwo {
    public static void main(String[] args) {

        interest(7.6,8.9,4.7);
        avg(12.0,5.0,7.8);
    }
    public static void avg(Double x,Double y,Double z) {
        Double jibu=(x+y+z)/3.0;
        System.out.println("Your average is "+jibu);
    }
    public static void interest(Double p,Double y,Double z) {
        Double interest=p*y*z/100;
        System.out.println("Your interest is "+interest);
    }
}
