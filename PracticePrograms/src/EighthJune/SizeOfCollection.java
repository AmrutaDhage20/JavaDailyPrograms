package EighthJune;

import java.util.*;

public class SizeOfCollection {

    public static void main(String[] args) {

        Collection<String> arraylist = new ArrayList<String>();

        arraylist.add("Naveen");
        arraylist.add("Automation");
        arraylist.add("Lab");
        System.out.println("Size of the collection " + arraylist.size());
        System.out.println("Is the ArrayList empty: " + arraylist.isEmpty());
    }
}