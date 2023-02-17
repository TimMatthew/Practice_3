public class Test{

    public static void main(String[] args)
    {
        System.out.println("-BIGINTEGER FACTORAIL-");
        System.out.println("What way do you wanna getfactorial?");
        System.out.print("1-by BigInteger  2-by cashed data: ");
        byte choice = DataInput.getByte();
        
        if(choice==1)
            computeBigIntFactorial();
        else if(choice==2)
            computeCashedFactorial();
    }

    private static void computeCashedFactorial() 
    {
        
    }

    private static void computeBigIntFactorial() 
    {
        System.out.print("Enter the positive number: ");
        int input = DataInput.getInt();
        
        while(input<0){
            System.out.println("Value is out of bounds!");
            System.out.print("Enter again: ");
            input = DataInput.getInt();
        }
        
        BigIntFactorial.calculateFactorial(input);
        System.out.println("The factorial of "+input+" is "+BigIntFactorial.factorial);
    }
}