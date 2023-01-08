package com.company.zadanie2;

public class Main {
    public static void main(String[] args) {


        StringContainer st = new StringContainer("\\d{2}[-]\\d{3}");

        st.add("02-495");
        st.add("01-120");
        st.add("05-123");
        st.add("00-000");
        st.add("Ala ma kota");
        st.add("Ala ma psa");

        for (int i = 0; i < st.getSize(); i++) {
            System.out.println("Kod pocztowy:" + st.get(i));
        }

        st.delete(0);  //usuwa "02-495"
        st.delete("00-000"); // usuwa "00-000"

        System.out.println("po usunieciu");
        for (int i = 0; i < st.getSize(); i++) {
            System.out.println(st.get(i));

        }

        // przeladowanie

    }
    }
