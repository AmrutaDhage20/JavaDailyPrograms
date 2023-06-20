package NinthJune;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.ArrayList;


public class ListItems {

    private Integer key;
    private String value;

    public ListItems(Integer id, String name) {
        this.key = id;
        this.value = name;
    }
    public Integer getkey() {
        return key;
    }
    public String getvalue() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        List<ListItems> list = new ArrayList<ListItems>();
        list.add(new ListItems(1, "I"));
        list.add(new ListItems(2, "Love"));
        list.add(new ListItems(3, "Java"));
        list.add(new ListItems(4, "Coding"));
        list.add(new ListItems(5, "Programs"));

        Map<Integer, String> map = new HashMap<>();

        list.forEach(
                (n) -> {
                    map.put(n.getkey(), n.getvalue());
                });
        System.out.println("Map : " + map);
    }
}