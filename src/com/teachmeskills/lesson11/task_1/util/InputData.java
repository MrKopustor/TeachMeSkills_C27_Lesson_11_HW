package com.teachmeskills.lesson11.task_1.util;

import java.util.Scanner;

import static com.teachmeskills.lesson11.task_1.service.ServiceStringOutput.*;
import static com.teachmeskills.lesson11.task_1.service.ServiceStringOutput.task_9;

/**
 * Class InputData
 * Accepts input data from console
 * Calls methods from the class ServiceStringOutput
 */
public class InputData {

    public static void inputDataProcessing() {
        String doc, doc2;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter document number");
            doc = scanner.nextLine();
            if (!doc.isEmpty()) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter string");
            doc2 = scanner.nextLine();
            if (!doc2.isEmpty()) {
                break;
            }
        }

        System.out.println(doc);
        System.out.println(doc2);
        System.out.println("----------");
        System.out.println(task_1(doc));
        System.out.println(task_2(doc));
        System.out.println(task_3(doc));
        System.out.println(task_4(doc));
        System.out.println(task_4_1(doc));
        System.out.println(task_5(doc));
        System.out.println(task_6(doc));
        System.out.println(task_7(doc));
        System.out.println(task_8(doc2));
        System.out.println(task_9(doc));

        scanner.close();
    }
}
