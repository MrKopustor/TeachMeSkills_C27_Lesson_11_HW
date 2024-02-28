package com.teachmeskills.lesson11.service;

public class PO {
    public static String completeTaskTwo(String string) {
        String[] arr = string.split("-");
        return string.replace(arr[1], "***").replace(arr[3], "***");
    }
}
