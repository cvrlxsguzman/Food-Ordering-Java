package McLTC;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

abstract class Order extends Menu implements MenuPrices {
    Menu menu = new Menu();
    ArrayList<ArrayList<String>> orderFinal = new ArrayList<>();
    ArrayList<String> order;
    ArrayList<Double> totalPrice = new ArrayList<>();
    String sandwichName;
    String friSize;
    String sodaSize;
    double total;
    int orderNumber;
    int userInput;

    Random rand = new Random();

    public  Order(int sandwichNum) {
        menu.setMenu();

        order = new ArrayList<>();
        if (sandwichNum == 1) {
            sandwichName = "Big LTC";
            total += BIgLTC;
            order.add(sandwichName);
        } else  if (sandwichNum == 2) {
            sandwichName = "Third Pounder w/Cheese";
            total += ThirdPounderWCheese;
            order.add(sandwichName);
        } else  if (sandwichNum == 3) {
            sandwichName = "Cheeseburger";
            total += Cheeseburger;
            order.add(sandwichName);
        } else if (sandwichNum == 4) {
            sandwichName = "McLTC Chicken";
            total += McLTCChicken;
            order.add(sandwichName);
        } else if (sandwichNum == 5) {
            sandwichName = "Slab-o-Fish";
            total += SlabOFish;
            order.add(sandwichName);
        }

        userInput = JOptionPane.showConfirmDialog(null, "Would you like to make this a meal? It's only $2.50 more!");

        if (userInput == 1) {
            friSize = "No Fries";
            sodaSize = "No Soda";
            order.add(friSize);
            order.add(sodaSize);
            orderFinal.add(order);
            totalPrice.add(total);
        } else if (userInput == 0) {
            while (true) {
                friSize = JOptionPane.showInputDialog(null, menu.getMenu() + "\nWhat size fries would you like: ").toLowerCase();

                if (friSize.equals("small") || friSize.equals("medium") || friSize.equals("large")) {
                    if (friSize.equals("small")) {
                        order.add("Small Fries");
                    }
                    if (friSize.equals("medium")) {
                        order.add("Medium Fries");
                    }
                    if (friSize.equals("large")) {
                        order.add("Large Fries");
                    }
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry! Must enter Small, Medium or Large");
                }

            }
            while (true) {
                sodaSize = JOptionPane.showInputDialog(null, menu.getMenu() + "\nWhat size soda would you like: ").toLowerCase();

                if (sodaSize.equals("small") || sodaSize.equals("medium") || sodaSize.equals("large")) {
                    if (sodaSize.equals("small")) {
                        order.add("Small Soda");
                    }
                    if (sodaSize.equals("medium")) {
                        order.add("Medium Soda");
                    }
                    if (sodaSize.equals("large")) {
                        order.add("Large Soda");
                    }
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry! Must enter Small, Medium or Large");
                }
            }
            total += Meal;
            totalPrice.add(total);
            orderFinal.add(order);
        }

    }

    public double getTotal() {
        return total;
    }

    public int getOrderNumber() {
        orderNumber = rand.nextInt(100000);

        return orderNumber;
    }

}