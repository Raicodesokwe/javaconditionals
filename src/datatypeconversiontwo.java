public class datatypeconversiontwo {
    public static void main(String[] args) {
        String x,y;
        Double xConv,yConv,jibu;
        x="23";
        y="34";

        xConv=Double.parseDouble(x);
        yConv=Double.parseDouble(y);

        jibu=xConv/yConv;
        System.out.println("Your answer is "+jibu);
    }
}
