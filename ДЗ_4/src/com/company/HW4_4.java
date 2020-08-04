package com.company;

import static java.lang.StringBuilder.*;

public class HW4_4 {
    public static void main(String[] args) {
        String str = "Все было замечательно";
        str += ", но мало";
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("Я люблю Java");
        stringBuilder.append (", но его надо учить");
        System.out.println(stringBuilder.toString());

    }
}
