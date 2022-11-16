package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyDataClass data = new MyDataClass(new ArrayList<>(Arrays.asList("Sascha", "Petia", "Vasia", "Illona",
                "Vasia", "Andrii", "Nataliia")));

        Iterator<String> itr = data.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
    }
}