package com.teachmeskills.lesson11.task_1.service;

/**
 * Class ServiceStringOutput
 * Contains methods for working this strings
 */
public class ServiceStringOutput {

    public static String task_1(String string) {
        String[] words = string.split("-");
        return (words[0] + " " + words[2]);
    }

    public static String task_2(String string) {
        String[] word = string.split("-");
        return string.replace(word[1], "***").replace(word[3], "***");
    }

    public static String task_3(String string) {
        String[] words = string.split("-");
        char[] word = words[4].toCharArray();
        String c = (word[1] + "/" + word[3]);
        return (words[1] + "/" + words[3] + "/" + c).toLowerCase();
    }

    public static String task_4(String string) {
        String[] words = string.split("-");
        char[] word = words[4].toCharArray();
        String c = (word[1] + "/" + word[3]);
        return ("Letters:" + (words[1] + "/" + words[3] + "/" + c).toUpperCase());
    }

    public static String task_4_1(String string) {
        StringBuilder sb = new StringBuilder(string);
        return ("Letters:" + (sb.substring(5, 8) + "/" +
                sb.substring(14, 17) + "/" +
                sb.substring(19, 20) + "/" +
                sb.substring(21, 22)).toUpperCase());
    }

    public static String task_5(String string) {
        //todo Есть метод игнора регистра ?
        //todo Чтобы в if просписать вместо toLowerCase(), (у меня не получилось)?
        if (string.toLowerCase().contains("abc")) {
            return "The document contains \"abc\"";
        } else {
            return "The document different argument";
        }
    }

    public static String task_6(String string) {
        if (string.startsWith("555.#6")) {
            return "The string starts with 555.#6";
        } else {
            return "The string starts with a different argument";
        }
    }

    public static String task_7(String string) {
        if (string.endsWith("1a2b")) {
            return "The string end with 1a2b";
        } else {
            return "The string end with a different argument";
        }
    }

    public static String task_8(String string) {
        String[] words = string.split(" ");
        String minLength = words[0];
        String maxLength = words[0];

        for (int i = 0; i < words.length; i++) {
            if (maxLength.length() <= words[i].length()) {
                maxLength = words[i];
            } else {
                minLength = words[i];
            }
        }
        return "Max words: " + maxLength + "\n" + "Min words: " + minLength;
    }

    public static String task_9(String string) {
        StringBuilder sb = new StringBuilder(string + "\n");
        for (int i = 0; i < string.length(); i++) {
            sb.append(string.charAt(i)).append(string.charAt(i));
        }
        return sb.toString();
    }
}
