package com.teachmeskills.lesson11.run;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter document number");
//        String doc = scanner.nextLine();

//                    xxxx-yyy-xxxx-yyy-xyxy
        String doc = "9584-dGg-4824-gII-8G4g";

        String[] words = doc.split("-");
//        for (String w : words) {
//            System.out.println(w);
//        }

        System.out.println("+++++++++++++");
        System.out.println(words[0] + " " + words[2]);
//        System.out.println(doc.toLowerCase());
//        System.out.println(doc.toCharArray()[1]);
//        System.out.println(doc.compareToIgnoreCase(doc));
    }

}
