import java.util.Scanner;

class even
  {
    public static void main (String []args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number :");
      int n = sc.nextInt();
      System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
  }
