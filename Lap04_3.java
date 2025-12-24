/*
 Money Exchange is a common task for visitors during Ramadhan and Hajj season. Write a program
to help visitors perform this task easily. Your program should display the menu as shown in the
sample run of the program. It should read the choice from the user and then should then ask the user
to enter the currency amount. Based on the value entered and the choice entered, the program should
calculate and then display the equivalent amount in Saudi Riyals (The current exchange rates can be
obtained from https://www.xe.com or any other online exchange rate converter).
(Note : Rates used for the output below are 1.03, 9.97 and 1.021 for QR-SAR, BD-SAR and AED-
SAR respectively)
 */
package Lap04;
import java.util.Scanner;

public class Lap04_3 {

    public static void main(String[] args) {
    
          Scanner input = new Scanner(System.in);

        System.out.print("Please enter weight of package (in kg): ");
        double weight = input.nextDouble();
        double cost = 0;

        if (weight > 0 && weight <= 1)
            cost = weight * 30;
        else if (weight > 1 && weight <= 3)
            cost = weight * 50;
        else if (weight > 3 && weight <= 10)
            cost = weight * 70;
        else if (weight > 10 && weight <= 20)
            cost = weight * 100;
        else {
            System.out.println("Weight out of range.");
            return;
        }

        double vat = cost * 0.15;
        System.out.printf("Total cost for shipping (including VAT): %.2f SAR%n", (cost + vat));
    
    }
    
}
