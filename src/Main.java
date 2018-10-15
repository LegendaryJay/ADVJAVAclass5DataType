import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number!");
        double number = scanner.nextDouble();
        if (number % 1 == 0){
            if(between(number, Byte.MIN_VALUE, Byte.MAX_VALUE)){
                System.out.println("Byte");
            } else if(between(number, Short.MIN_VALUE, Short.MAX_VALUE)){
                System.out.println("Short");
            } else if(between(number, Integer.MIN_VALUE, Integer.MAX_VALUE)){
                System.out.println("Int");
            } else if(between(number, Long.MIN_VALUE, Long.MAX_VALUE)){
                System.out.println("Long");
            } else {
                System.out.println("Probably big Int");
            }

        } else {
            if(between(number, Long.MIN_VALUE, Long.MAX_VALUE)){
                System.out.println("Long");
            } else if(between(number, Double.MIN_VALUE, Double.MAX_VALUE)){
                System.out.println("Double");
            } else {
                System.out.println("Probably big Decimal");
            }

        }

    }

    private static boolean between(double val, double min, double max){
        return val >= min && val <= max;
    }
}
