package com.company;

public class Main {

    public static void main(String[] args) {
	// Найти в строке не только запятые,
        // но и другие знаки препинания. Подсчитать общее их количество

        String str = "Добрый день. Как у Вас дела? У меня все хорошо! Однако, " +
                "было бы еще лучше, если бы мы смогли видеться с Вами чаще.";

        int before = str.length();
        int after = str.replaceAll("[,.?!:;]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (before - after));
    }
    }
