package McLTC;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {
    private ArrayList<String> sandwiches = new ArrayList<>();
    private ArrayList<String> fries = new ArrayList<>();
    private ArrayList<String> sodaSize = new ArrayList<>();
    StringBuilder sandwichMenu = new StringBuilder();
    StringBuilder friesMenu = new StringBuilder();
    StringBuilder sodaMenu = new StringBuilder();
    StringBuilder menu = new StringBuilder();

    public void setMenu() {
        setSandwiches();
        setFries();
        setSodaSize();

        menu.append("McLTC Menu").append("\n\n")
                .append("Sandwiches").append("\n")
                .append("----------").append("\n")
                .append(sandwichMenu).append("\n")
                .append("Fries").append("\n")
                .append("----------").append("\n")
                .append(friesMenu).append("\n")
                .append("Soda").append("\n")
                .append("----------").append("\n")
                .append(sodaMenu);
    }

    private void setSandwiches() {
        sandwiches.add("#1 Big LTC");
        sandwiches.add("#2 Third Pounder w/Cheese");
        sandwiches.add("#3 Cheeseburger");
        sandwiches.add("#4 McLTC Chicken");
        sandwiches.add("#5 Slab-o-Fish");

        for (String sandwich : sandwiches) {
            sandwichMenu.append(sandwich).append("\n");
        }
    }

    private void setFries() {
        fries.add("Small");
        fries.add("Medium");
        fries.add("Large");

        for (String fri : fries) {
            friesMenu.append(fri).append("\n");
        }
    }

    private void setSodaSize() {
        sodaSize.add("Small");
        sodaSize.add("Medium");
        sodaSize.add("Large");

        for (String soda : sodaSize) {
            sodaMenu.append(soda).append("\n");
        }
    }


    public StringBuilder getMenu() {
        return menu;
    }
}
