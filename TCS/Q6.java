/*
 26 OCT 2020 SLOT 1
 Coding Question 1:
 */
package TCS;

import java.io.*;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] Tea = { "plain Tea", "Assam Tea", "Ginger Tea", "Candamon Tea", "Masala Tea", "Lemon Tea", "Green Tea",
                "Organic Darjeeling Tea" };

        String[] Soups = { "Hot and Sour Soup", "Veg Corn Soup", "Tomato Suop", "Spicy Tomato Soup" };

        String[] Beverages = { "Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink" };

        String mainMenu = reader.readLine();
        int subMenu =  Integer.parseInt((reader.readLine())) ;

        // int subMenu = scan.nextInt();

        if (mainMenu == "T" || mainMenu == "t" || mainMenu == "S" || mainMenu == "s" || mainMenu == "B"
                || mainMenu == "b") {
            if (mainMenu == "T" || mainMenu == "t") {
                if (subMenu < 1 || subMenu > 8) {
                    System.out.println("INVALID INPUT");
                } else {
                    System.out.println(Tea[subMenu - 1]);
                }
            } else if (mainMenu == "S" || mainMenu == "s") {
                if (subMenu < 1 || subMenu > 4) {
                    System.out.println("INVALID INPUT");
                } else {
                    System.out.println(Soups[subMenu - 1]);
                }
            } else if (mainMenu == "B" || mainMenu == "b") {
                if (subMenu >= 1 && subMenu <= 3) {
                    System.out.println(Beverages[subMenu - 1]);
                } else {
                    System.out.println("INVALID INPUT");
                }
            }

        } else {
            System.out.println("INVALID INPUT from M");
        }
    }
}
