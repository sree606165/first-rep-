import java.util.Scanner;

class prime
{
    public static void main(String[ ]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number:");
       int n = sc.nextInt();
       boolean prime = true;
       if (n <= 1) prime = false;
       for (int i = 2 ; i <= Math.sqrt(n); i++)
       {
        if( n % i == 0)
        {
            prime = false;
        break;
       }
    }
    System.out.println(prime ? "Prime Number": "Not Prime Number");
}
}