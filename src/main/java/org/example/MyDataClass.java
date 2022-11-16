package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataClass implements Iterable<String>{
    List <String>list;
    public MyDataClass(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayIterator(list);
    }
}
