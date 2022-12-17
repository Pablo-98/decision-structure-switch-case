/*
 * write a program that requests the computer user 
 * to enter "what do you want to drink?"
 * Your program  shall display a hot drink or cold drink based on the menu
 * hot : coffee, tea
 * cold, horchata, soda, water
 */

 import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to drink");
        String beverage = input.nextLine();

        if (beverage.equals("coffee") || beverage.equals("tea")){
            System.out.println("Hot beverage");
        }

        else {
            System.out.println(" Cold bev"")
        }
    }
}