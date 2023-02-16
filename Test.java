import java.math.BigInteger;

public class Test{

    public static void main(String[] args){
        System.out.println("-BIGINTEGER FACTORAIL-");
        System.out.print("Enter the positive number: ");
        int input = DataInput.getInt();
        
        while(input<0){
            System.out.println("Value is out of bounds!");
            System.out.print("Enter again: ");
            input = DataInput.getInt();
        }
        
        FactorialClass1.factorial = BigInteger.valueOf(input);
        FactorialClass1.calculateFactorial(FactorialClass1.factorial);
        System.out.println("Factorial of "+input+" number is "+FactorialClass1.factorial);
    }
}