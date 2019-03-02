package zad17;

import java.util.Scanner;

public class Trips {
    public static void main(String[] args) {

        int trips, distance = 0, liters = 0, x = 1;
        double combustion = 0;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę wycieczek");
        trips = input.nextInt();

        while (x <= trips) {
            System.out.println("Podaj ilość przejechanych km podczas wycieczki: " + x);
            distance = input.nextInt();
            System.out.println("Podaj ilość splaonych litrów: ");
            liters = input.nextInt();
            combustion = (double) liters / distance;
            System.out.println("Spalanie podczas wycieczki " + x + " wynosi " + combustion + " l/km");
            sum += combustion;
            x++;
        }

        System.out.println("średnie spalanie podczas wycieczek wyniosło: " + (double) sum / trips);

    }
}
