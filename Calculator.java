import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of 1st number :");
        int a = s.nextInt();

        System.out.println("Enter value of 2nd number :");
        int b = s.nextInt();

        System.out.println("Select operation");
        System.out.println("Addition-1: Subtraction-2: Multiplication-3: Division-4: ");
        char ch = s.next().charAt(0);
        switch(ch) {
            case '1' :
                System.out.println("Sum of the given two numbers: "+(a+b));
                break;
            case '2' :
                System.out.println("Difference between the two numbers: "+(a-b));
                break;
            case '3' :
                System.out.println("Product of the two numbers: "+(a*b));
            case '4' :
                System.out.println("Result of the division: "+(a/b));
                break;
            default :
                System.out.println("Invalid Operation");
        }
    }
}