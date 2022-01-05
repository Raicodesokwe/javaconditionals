public class Methodoverloading {
    public static void main(String[] args) {

      noma("Kimi","Zaga","Darren");
      noma(12.9,5.9,8.7);
      noma(8,9,12);
    }
    public static String noma(String x,String y,String z){
        String jibu=x+y+z;
        System.out.println(jibu);
        return jibu;
    }
    public static Integer noma(Integer x,Integer y,Integer z){
        Integer jibu=x+y+z;
        System.out.println(jibu);
        return jibu;
    }
    public static Double noma(Double x,Double y,Double z){
        Double jibu=x+y+z;
        System.out.println(jibu);
        return jibu;
    }
}
