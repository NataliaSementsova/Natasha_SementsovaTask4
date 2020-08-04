package com.company;

public class HW4_2 {
    public static void main(String[] args) {
        String str = "Представляя Вселенную как весь " +
                "окружающий мир, мы сразу делаем её уникальной и единственной.";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Ввели "+count+ " слов");
    }
}
