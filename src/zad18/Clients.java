package zad18;

import java.util.Scanner;

public class Clients {


    public static void main(String[] args) {
        int numberAccount = 0;
        int beginStatus = 0;
        int shoppingSum = 0;
        int payment = 0;
        int limit = 0;
        System.out.println("Wprowadź dane konta:");
        System.out.println("Podaj numer konta:");
        Scanner input = new Scanner(System.in);
        numberAccount = input.nextInt();
        System.out.println("Podaj saldo na początku miesiąca:");
        beginStatus = input.nextInt();
        System.out.println("Podaj kwotę wydaną w miesiacu na zakupy:");
        shoppingSum += input.nextInt();
        System.out.println("podaj kwotę wpłat");
        payment += input.nextInt();
        System.out.println("Podaj limit kredytowy");
        limit = input.nextInt();

        if(limit<beginStatus+payment-shoppingSum){
            System.out.println("Przekroczono limit");
        }else
            System.out.println("Nowe saldo wynosi" +  (beginStatus+payment-shoppingSum));


    }

}
