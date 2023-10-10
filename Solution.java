import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args)
    {
        int num;

        //create scanner for input
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = console.nextInt();

        System.out.println(isPrime(num));

    }

    static public boolean isPrime(int num)
    {
        
        boolean result = true;

        if(num == 1)
        {
            result = false;
        }
        else if(num <= 0)
        {
            result = false;
        }
        
        else
        {
            for(int i = 2; i <= num/2; i++)
            {
                if(num%i == 0)
                {
                    result = false;
                    return result;
                }
                else
                {
                    result = true;
                }
            }
        }
        return result;
    }
}
