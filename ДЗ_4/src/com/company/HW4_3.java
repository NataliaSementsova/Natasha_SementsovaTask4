package com.company;

public class HW4_3 {
    public static void main(String[] args) {

    String str = "And we mean well in going to this mask";
    StringBuilder res = new StringBuilder();

    String [] words = str.split("\\s+");
        for ( String word : words )
            res.append(word.toCharArray()[word.length() - 1]);

        System.out.println("String: " + str);

        System.out.println("текст из последних букв " + res.toString());
}
}

