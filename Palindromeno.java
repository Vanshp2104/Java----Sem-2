import java.util.Scanner;
public class Palindromeno
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n,r,sum=0,temp;
        System.out.print("Enter your number:");
        n=s.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
