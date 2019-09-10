import java.util.Scanner;

public class Bog_opgaver {
    public static void main(String[] args) {
        System.out.println("1.5");
        System.out.print("(7.5 * 6.3 - 4.5 * 3) / (47.5 - 5.5) " + "= ");
        System.out.println((7.5 * 6.3 - 4.5 * 3) / (47.5 - 5.5));
        System.out.println();

        System.out.println("1.6");
        System.out.println("sum " + "= " + (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10));
        System.out.println();

        System.out.println("1.7");
        System.out.println("pi " + "= " + (4 * (1.0 - (1 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11))));
        System.out.println("pi " + "= " + (4 * (1.0 - (1 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13))));
        System.out.println();

        System.out.println("1.8");
        System.out.println("perimiter " + "= " + (2 * 6.5 * 3.14159));
        System.out.println("area " + "= " +(6.5 * 6.5 * 3.14159));
        System.out.println();

        System.out.println("1.9");
        System.out.println("area = " + (5.3 * 8.6));
        System.out.println("perimiter = " + (2 * (5.3 + 8.6)));
        System.out.println();

        System.out.println("1.10");
        System.out.println("First convert to miles");
        System.out.println(15 * 0.621);
        System.out.println("then how far is he running pr second?");
        System.out.println(9.315 / ((50 * 60) + 30));
        System.out.println("then how far is he running pr hour?");
        System.out.println((0.00307426 * 3600) + "mph");
        System.out.println();

        System.out.println("1.12");
        double lengthMiles = 24;
        double timeSeconds = ((100 * 60) + 35);
        double timeHour = 3600;
        System.out.println("miles pr second = " + lengthMiles / timeSeconds);
        System.out.println("converted to kilometers pr second = " + lengthMiles / timeSeconds * 1.6);
        System.out.println("converted into km/h = " + lengthMiles / timeSeconds * 1.6 * 3600);



    }
}
