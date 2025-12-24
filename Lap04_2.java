/*
 A shipping company (like Aramex or Saudi Post) uses the following function to calculate the cost (in
SAR) of shipping based on the weight (w) of the package (in Kgs)
𝑐𝑜𝑠𝑡 𝑝𝑒𝑟 𝑘𝑔 = , 𝑆𝐴𝑅 50 𝑖𝑓 1 𝑘𝑔 ≤ 𝑤 ≤ 3 𝑘𝑔
𝑆𝐴𝑅 70 𝑖𝑓 3𝑘𝑔 < 𝑤 ≤ 10 𝑘𝑔
𝑆𝐴𝑅 30 𝑖𝑓 0 𝑘𝑔 < 𝑤 ≤ 1 𝑘𝑔
𝑆𝐴𝑅 100 𝑖𝑓 10𝑘𝑔 < 𝑤 ≤ 20𝑘𝑔
A 15% VAT is to be added to the calculated cost and the total displayed to the user.
 */
package Lap04;
import java.util.Scanner;

public class Lap04_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter weight of package (in Kg) : ");
        double w = input.nextDouble();
        double costPerKg ;

        if (w > 0 && w <= 1)
            costPerKg = 30;
        else if (w > 1 && w <= 3)
            costPerKg = 50;
        else if (w > 3 && w <= 10)
            costPerKg = 70;
        else if (w > 10 && w <= 20)
            costPerKg = 100;
        else {
            System.out.println("Invalid weight. Must be between 0 and 20 Kg.");
            return;
        }

        double cost = w * costPerKg;
        double total = cost + (cost * 0.15);

        System.out.printf("Total cost for shipping (including VAT) : SAR %.2f%n", total);
    }
    
}
