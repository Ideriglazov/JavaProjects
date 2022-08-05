package assignment2;

import java.util.*;
public class GetToy {
    public String getToy(int id) {
        /*
        Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6),
Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56)
         */
        String toyName = "";
        HashMap<Integer, String> toys = new HashMap<Integer, String>();
        toys.put(12, "Batmobile");
        toys.put(45, "Light Saber");
        toys.put(6, "Wonder Woman");
        toys.put(201, "Hello Kitty Bag");
        toys.put(56, "Junior QA Analyst");
        if (toys.get(id) != null && !(toys.get(id).isBlank())) {
            toyName = toys.get(id);
        }
        else {
            toyName = "No such Toy";
        }
        return toyName;
    }
}
