/*
 * Made by Tymofii Matiichyk
 * This programm calculates factorials by 2 ways.
 * 1) Using a BigInteger class
 * 2) Using cashed data stored in a private long[] array
 */

import java.io.IOException;
import java.util.Arrays;

public class Test{

    public static void main(String[] args) throws IOException
    {
        setup();
    }

/**
 * 
 * @throws IOException
 */
    private static void setup() throws IOException {
        System.out.println("What way do you wanna get factorial?");
        System.out.print("1-by BigInteger  2-by cashed data  0-quit the programm: ");
        byte choice = DataInput.getByte();
        
        if(choice==1){
            computeBigIntFactorial();
        }
        else if(choice==2){
            computeCashedFactorial();
        }
        else if(choice==0)
            System.out.println("--EXIT--");
    }
/**
 * computeCashedFactorial() gets number of which factorial will be calculated.
 * It requires input again till it`s in range of 0 and 20.
 * @throws IOException
 */
    public static void computeCashedFactorial() throws IOException 
    {
        System.out.println("\n-CASHED FACTORIAL-");
        System.out.println(Arrays.toString(CashedFactorial.factorials)+"\n");
        System.out.println("Enter a number of factorial ");
        System.out.print("Enter the number in range of 0 and 20: ");
        int input = DataInput.getInt();
        
        while (input < 0 || input > 20) {
            System.out.println("Input is out of bounds!");
            System.out.print("Enter again: ");
            input = DataInput.getInt();
        }
        if(input==1 || input==0)
            CashedFactorial.exceptionalCases(input);
        else
            System.out.println(CashedFactorial.calculate(input));
        System.out.println(Arrays.toString(CashedFactorial.factorials)+"\n");
        setup();
    }

/**
 * computBigIntFactorial() gets number of which factorial will be calculated.
 * It requires input again till it`s positive.
 * @throws IOException
 */
    public static void computeBigIntFactorial() throws IOException 
    {
        System.out.println("\n-BIGINTEGER FACTORIAL-");
        System.out.print("Enter the positive number: ");
        int input = DataInput.getInt();

        while (input < 0) {
            System.out.println("Input is out of bounds!");
            System.out.print("Enter again: ");
            input = DataInput.getInt();
        }
        BigIntFactorial.calculateFactorial(input);
        System.out.println("The factorial of "+input+" is "+BigIntFactorial.factorial+"\n");
        setup();
    }
}