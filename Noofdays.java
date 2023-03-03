import java.util.Scanner;
public class Noofdays
{
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int days = 0;
        String month="any" ;

        System.out.print("Input a month number: ");
        int monthno = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (monthno) {
            case 1:
                month = "January";
                days = 31;
                break;
            case 2:
                month = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                month = "March";
                days = 31;
                break;
            case 4:
                month = "April";
                days = 30;
                break;
            case 5:
                month = "May";
                days = 31;
                break;
            case 6:
                month = "June";
                days = 30;
                break;
            case 7:
                month = "July";
                days = 31;
                break;
            case 8:
                month = "August";
                days = 31;
                break;
            case 9:
                month = "September";
                days = 30;
                break;
            case 10:
                month = "October";
                days = 31;
                break;
            case 11:
                month = "November";
                days = 30;
                break;
            case 12:
                month = "December";
                days = 31;
        }
        System.out.print(month + " " + year + " has " + days + " days\n");
    }
}