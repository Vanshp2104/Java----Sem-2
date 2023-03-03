import java.util.Scanner;
public class Resultswitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Score in FDC");
        int FDC = s.nextInt();
        switch (FDC / 10) {
            case 10: System.out.println("Your Grade In FDC = A+");
            break;
            case 9: {
                if ((FDC >= 95) && (FDC < 100)) {
                    System.out.println("Your Grade In FDC = A+");
                } else
                    System.out.println("Your Grade In FDC = A");
                break;
            }
            case 8: {
                if ((FDC >= 85) && (FDC < 90)) {
                    System.out.println("Your Grade In FDC = B+");
                } else
                    System.out.println("Your Grade In FDC = B");
                break;
            }
            case 7: {
                if ((FDC >= 75) && (FDC < 80)) {
                    System.out.println("Your Grade In FDC = C+");
                } else
                    System.out.println("Your Grade In FDC = C");
                break;
            }
            default: {
                System.out.println("Repeat your grade");
                }
            }
        }
    }

