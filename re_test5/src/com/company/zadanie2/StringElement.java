package com.company.zadanie2;

public class StringElement {

    private Object value;
    private StringElement next;

    public StringElement(Object value, StringElement next) {
        this.value = value;
        this.next = next;
    }

    public StringElement(Object value) {
        this(value, null);
    }

    public Object getValue() {
        return value;
    }

    public StringElement getNext() {
        return next;
    }

    public void setNext(StringElement n) {
        next = n;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void setValue(Object o) {
        value = o;
    }

    @Override
    public String toString() {
        return "kod pocztowy " + value + " "
                + next;
    }
}
