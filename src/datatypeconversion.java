public class datatypeconversion {
    public static void main(String[] args) {
        String x,y;
        Integer xConv,yConv,jibu;
        x="10";
        y="20";
        System.out.println(x+y);
        //convert x and y o integer values
        xConv=Integer.parseInt(x);
        yConv=Integer.parseInt(y);
        jibu=xConv+yConv;
        System.out.println("Your answer is "+jibu);
    }
}
