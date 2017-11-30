package Lab11;

// Basit Qureshi Nov 26, 2017 9:52:21 AM

public class Q5 
{
    public static void main(String [] args)
    {
        int count = 0;
        for(int i=2;i<1000;i++)
        {
            
            if(palindromicPrime(i))
            {
                System.out.print(i + " ");
                count++;
            }
            
            if(count==10)
            {
                count=0;
                System.out.println();
            }
        }
    }
    public static boolean isPrime(int n)
    {
        boolean isPrime = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                isPrime=false;
        }
        return isPrime;
    }
    
    public static boolean palindromicPrime(int n)
    {
        if(!isPrime(n))// if it is not prime return false;
            return false;
        //here we are assured that n is prime.... now to check if it is palindrome;
        
        //if it is single digit... e.g. 1 2 3 5 7
        if(n==1 || n==2 || n==3 || n==5 || n==7)
            return true;
        
        // if it is 2 digits.. then we have to check that both digits have the same value
        else if(n>=10 && n<=99)
        {
            int firstDigit = n/10;
            int secondDigit = n%10;
            if(firstDigit==secondDigit)
                return true;
        }
        
        //if it is a 3 digit number, then we have to check if first and last digits are the same
        else if(n>=100 && n<=999)
        {
            int firstDigit = n/100; //e.g 591/100 is 5.91 which is 5
            int thirdDigit = n%10;
            if(firstDigit==thirdDigit)
                return true;
        }
        
        return false; // we assume everything else is false;
        
    }
    
    
}
