/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country and Capital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France",
                "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    for (String country : selected) {
                        System.out.println("Capital of " + country + " is: " + capitals.get(country));
                    }
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
