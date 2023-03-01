package BIMCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    //Body Mass Index (BIM) = Weight(kg) / (Height(m))^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat obj = new DecimalFormat("0.0");

        double bim = calculateBim(sc);
        System.out.println("You Body Mass Index(BIM) is "+obj.format(bim)+" kg/m^2.");
        weightStatus(bim);
    }
    private static double calculateBim(Scanner sc) {
        System.out.println("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in meter: ");
        double height = sc.nextDouble();

        double bim;
        bim = weight/ Math.pow(height, 2);
        return bim;
    }
    private static void weightStatus(double bim) {
        if (bim <18.5)
            System.out.print("You are in underweight category.");
        else if (bim <24.9)
            System.out.print("You are in healthy weight category.");
        else if (bim <29.9)
            System.out.print("You are in overweight category.");
        else
            System.out.print("You are obese category.");
    }
}
