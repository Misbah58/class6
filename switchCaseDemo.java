package Class6;

import java.util.Locale;
import java.util.Scanner;

public class switchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String country=scanner.next();

        System.out.println("enter country");

        switch (country.toLowerCase()) { // converts the text to lower case
            case "use":
                System.out.println("Burgers");
                break;

            case "Italy":
                System.out.println("Pasta");
                break;
            default:
                System.out.println("wrong country");
        }
    }
}