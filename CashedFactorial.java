import java.io.IOException;

public class CashedFactorial {
    
    public static int[] factorials = new int[21];
    private static int factsCalculated = 1;
    
    
    public static int calculate(int n) throws IOException {
        
        if (n <= factsCalculated) 
        {
            System.out.println("\nEeeehhmm, I have this one already...");
            return factorials[n];
        }
        
        else if(n>factsCalculated && factsCalculated>1)
        {
            System.out.println("\n Hhhmmmm, I`ll count it by "+factorials[factsCalculated]+"...");
            
            for(int i=factsCalculated+1; i<=n; i++){
                factorials[i]=factorials[i-1]*i;
            }
            factsCalculated=n;
            return factorials[n];
        }
        else 
        {
            factorials[0]=1;
            factorials[1]=1;
            for (int i = factsCalculated + 1; i <= n; i++) {
                factorials[i] = factorials[i-1]*i;
            }
            factsCalculated = n;
            return factorials[n];
        }   
    }

    public static int exceptionalCases(int nn){
        
        if(nn==0 && factorials[0]==0)
            return factorials[0]=1;
        else if(nn==0 && factorials[0]==1)
        {
            System.out.println("\nEeeehhmm, I have this one already...");
            return factorials[0]=1;
        }
        else if(nn==1 && factorials[1]==0 && factorials[0]==0){
            factorials[0]=1;
            return factorials[nn]=1;
        }
        else
        {
            System.out.println("\nEeeehhmm, I have this one already...");
            return factorials[nn]=1;
        }
    }
}

