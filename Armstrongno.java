import java.util.Scanner;
public class Armstrongno
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = s.nextInt();
        int temp = n;
        int p = 0;

        while (n > 0)
        {

            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }
    }
}