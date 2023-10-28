import java.util.Scanner;

public class Question7 {
    public static void main(String args[])
    {
        System.out.println("Bharat Prajapati \n Roll no : 3058" );
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        a = Math.abs(a);
        b=Math.abs(b);

        int gcd = findGcd(a , b);
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        sc.close();
    }
    public static int findGcd(int a, int b)
    {
        while(b != 0)
        {
            int temp  =b;
            b = a%b;
            a= temp;

        }
        return a;

    } 
}
