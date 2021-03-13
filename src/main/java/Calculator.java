import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter your Choice: \n 1.Factorial \n 2.Power \n 3.Square Root\n 4.Natural Log\n 5.Exit\n");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            try {
                switch (ch) {
                    case 1:
                        System.out.println("Enter a number: ");
                        int n = sc.nextInt();
                        System.out.println("factorial of " + n + " is: " + fact(n));
                        break;
                    case 2:
                        System.out.print("enter number: ");
                        double a = sc.nextDouble();
                        System.out.print("enter power: ");
                        double b = sc.nextDouble();
                        System.out.println(a + " raised to power " + b + " is: " + power(a, b));
                        break;
                    case 3:
                        System.out.println("enter number: ");
                        double m = sc.nextDouble();
                        System.out.println("square root of " + m + " is: " + sqroot(m));
                        break;
                    case 4:
                        System.out.println("enter number: ");
                        double l = sc.nextDouble();
                        System.out.println("natural log of " + l + " is: " + logarithm(l));
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Wrong Input");

            } catch (IllegalArgumentException e) {
                System.out.println("Input cant be negative");
            }


        }
    }

    public static double logarithm(double a){
        logger.info("Calculating Natural Logarithm of : " + a + "\n Result : " + Math.log(a));
        return java.lang.Math.log(a);
    }
    public static double sqroot(double a){
        logger.info("Calculating Square Root of : " + a + "\n Result : " + Math.sqrt(a));
        return java.lang.Math.sqrt(a);
    }

    public static double fact(int n){
        if(n<0) {
            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }
        double fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        logger.info("Factorial of the number : " + n + "\n Result is : " + fact);
        return fact;
    }
    public static double power(double a,double b){
        logger.info("Power : " + a + "^" + b + "/n Result : " + Math.pow(a, b));
        return java.lang.Math.pow(a,b);
    }

}

