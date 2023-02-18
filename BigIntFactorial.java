/*
 * Made by Tymofii Matiichyk
 * Class BigIntInteger calculates factorials of such number 
 * which are out of bounds of any numeric variables (short, byte, int, long)
 */
import java.math.BigInteger;

public class BigIntFactorial{
    
    public static BigInteger factorial = BigInteger.ONE;
    
    public static BigInteger calculateFactorial(int num)
    {   
        if(num==0 || num==1) return BigInteger.ONE;
        
        for(int i=1; i<=num; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;    
    }

}