package com.company.zadanie2;

import java.time.LocalDateTime;

public class StringElement {
    private Object value;
    private StringElement next;
    private LocalDateTime dateTime;

    public StringElement(Object value, StringElement next, LocalDateTime dateTime) {
        this.value = value;
        this.next = next;
        this.dateTime = dateTime;
    }

    public StringElement(Object value) {
        this(value, null, null);
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "kod pocztowy " + next + " " + getDateTime();
    }
}