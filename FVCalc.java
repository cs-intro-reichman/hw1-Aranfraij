// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
        
       int currentValue = Integer.parseInt(args[0]);
       double rate = Double.parseDouble(args[1]);
       int years = Integer.parseInt(args[2]);
        
       double futurevalue = currentValue * (Math.pow(1+ rate/100, years));
       System.out.println("After " + years+ "years, a $ "+ currentValue
       + "saved at "+rate+ " % will yield $ "+ (int)futurevalue);
	}
}
