
public class Bill3 {


    public static void main(String[] args) {
    
        String name1 = args[0];
        String name2 = args[1] ;
        String name3 = args[2] ;
        double d;
        d = Double.parseDouble(args[3]);
        double e = Math.ceil( d /3);
        System.out.println("Dear "+name3+ ", "+name2+", and "+name1+": pay "+e);
        //System.out.println(name3+ ", "+ name2+ " and "+name1+" "+ d);
        //System.out.println("dear " +name3 + ", " +name2+", and "+ name1+ ": pay " + e + " shekels each");
    }
}