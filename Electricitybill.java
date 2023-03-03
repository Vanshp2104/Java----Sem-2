import java.util.Scanner;
public class Electricitybill
{
    public static void main(String[] args) {
        int units;
        double bill = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of units for calculating electricity bill.");
        units = s.nextInt();
        if (units <= 50)
        {
            bill = units * 0.5;
        }
        else if (units <= 150)
        {
            bill = 25+((units - 50)* 0.75);
        }
        else if (units <= 250)
        {
            bill = 100+((units - 150) * 1.20);
        }
        else
        {
            bill =220 +((units-250) * 1.50);
        }
        bill+=bill * 0.2;
        System.out.println("The electricity bill for " + units + " is : " + bill);
    }
}