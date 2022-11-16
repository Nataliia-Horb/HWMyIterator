package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *  Реализовать класс(ArrayIterator) итератор, который будет имплементировать интерфейс(Iterator)
 *  по заданному массиву обьектов. Создать массив тестовых обьектов ( 7 штук ) и используя реализованный класс
 *  ArrayIterator вывести на экран содержимое массива.
 */
public class ArrayIterator implements Iterator {
    int count=0;
    List list;

    public ArrayIterator(List list) {
        this.count = 0;
      this.list=list;
    }

    @Override
    public boolean hasNext() {
        return (count>=0 && count <list.size());
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(count++);
    }
}
