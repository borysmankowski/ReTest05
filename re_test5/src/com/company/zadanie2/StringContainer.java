package com.company.zadanie2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDateTime;


public class StringContainer {

    private int size = 0;
    private StringElement head = new StringElement(null);
    private Pattern pattern;

    public StringContainer(String regex) {
        clear();
        this.pattern = Pattern.compile(regex);
    }

    public void clear() {
        head.setNext(null);
        size = 0;
    }

    public void add(String value) {
        Matcher matcher = pattern.matcher(value);
        try {
            if (matcher.matches()) {
                if (head.getNext() == null) {
                    head.setNext(new StringElement(value, null, LocalDateTime.now()));
                }
                StringElement last = head.getNext();
                while (last.getNext() != null)
                    last = last.getNext();
                ++size;
                last.setNext(new StringElement(value, null, LocalDateTime.now()));
            } else {
                throw new InvalidStringContainerPatternException("Nie maczuje siê");
            }
        } catch (InvalidStringContainerPatternException e) {
            e.printStackTrace();
        }
    }

    public boolean delete(Object o) {
        if (head.getNext() == null) return false;
        if (head.getNext().getValue().equals(o)) {
            head.setNext(head.getNext().getNext());
            size--;
            return true;
        }
        StringElement delete = head.getNext();
        while (delete != null && delete.getNext() != null) {
            if (delete.getNext().getValue().equals(o)) {
                delete.setNext(delete.getNext().getNext());
                size--;
                return true;
            }
            delete = delete.getNext();
        }
        return false;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public Object get(int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        StringElement find = head.getNext();
        for (int i = 0; i <= position; i++)
            find = find.getNext();
        return find.getValue();
    }

    public StringContainer getDataBetween(LocalDateTime dateFrom, LocalDateTime dateTo) {
        StringContainer result = new StringContainer(this.pattern.pattern());
        StringElement current = this.head.getNext();
        while (current != null) {
            StringElement currentWithDate = current;
            if (currentWithDate.getDateTime().isAfter(dateFrom) && currentWithDate.getDateTime().isBefore(dateTo)) {
                result.add((String) currentWithDate.getValue());
            }
            current = current.getNext();
        }
        return result;
    }

    @Override
    public String toString() {
        return "StringContainer{" +
                "size=" + size +
                ", head=" + head;
    }
}
