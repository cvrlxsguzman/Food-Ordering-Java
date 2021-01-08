package McLTC;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setMenu();
        ArrayList<Order> order = new ArrayList<>();
        int userInput;
        int userInput2;
        boolean quit = false;

        JOptionPane.showMessageDialog(null, "Welcome to McLTC!");

        do {

            double total = 0;
            int orderNumber = 0;

            while (true) {
                try {
                    userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "McLTC\n" +
                            "-----------\n" +
                            "What do you want to do?\n" +
                            "1. Start New Order\n" +
                            "2. Quit"));

                    if (userInput == 1 || userInput == 2) {
                        break;
                    }
                }
                catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "McLTC\n" +
                            "----------\n" +
                            "Sorry! Must enter a number (1-2)");
                }
            }
            switch (userInput) {
                case 1-> {
                    while (true) {
                        while (true) {
                            try {
                                userInput = Integer.parseInt(JOptionPane.showInputDialog(null, menu.getMenu() + "\nEnter sandwich number you'd like: "));

                                if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5) {
                                    break;
                                }

                            }
                            catch (NumberFormatException x) {
                                JOptionPane.showMessageDialog(null, "McLTC\n" +
                                        "----------\n" +
                                        "Sorry! Must enter a number (1-5)");
                            }

                        }
                        Order newOrder = new MakeOrder(userInput);

                        total += newOrder.getTotal();

                        userInput = JOptionPane.showConfirmDialog(null, "Do you want to add more food to order?");
                        if (userInput == 1) {
                            orderNumber = newOrder.getOrderNumber();

                            JOptionPane.showMessageDialog(null, "Your total is $" + total + "\n" +
                                    "Your order # is: " + orderNumber);

                            JOptionPane.showMessageDialog(null, "Please hold on while we make your order!");

                            JOptionPane.showMessageDialog(null, "Your order #" + orderNumber + " is complete! Enjoy!");

                            break;
                        }
                    }

                }
                case 2-> quit = true;
            }

        } while (!quit);

        JOptionPane.showMessageDialog(null, "McLTC\n" +
                "-----------\n" +
                "Have a good day from everyone at McLTC!");
    }
}
