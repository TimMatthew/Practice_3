import java.math.BigInteger;

public class FactorialClass1{
    
    public static BigInteger factorial;
    
    public static BigInteger calculateFactorial(BigInteger N){
        if(N.equals(0) || N.equals(0))
            return BigInteger.valueOf(1);
        
            //Refactoring
            else return calculateFactorial(N).subtract(calculateFactorial(N.subtract(BigInteger.valueOf(1))));
    }
}