package com.teachmeskills.lesson11.launcher;

import static com.teachmeskills.lesson11.service.ServiceStringOutput.*;

public class Runner {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter document number");
//        String doc = scanner.nextLine();

        //todo Сделать метод для проверки строки на пустоту - isEmpty().

        String doc = "9584-dGg-4824-gII-8G4g";
        String doc2 = "555.#6fsdfdsf1a2b";
        String doc3 = "afkjasfksaj ksafj sakfj kjk fjjf f kksajf  4 osiafoi 9a8 0";
        System.out.println("xxxx-yyy-xxxx-yyy-xyxy");
        System.out.println(doc);
        System.out.println(doc2);

        System.out.println("----------");
        System.out.println(task_1(doc));
        System.out.println(task_2(doc));
        System.out.println(task_3(doc));
        System.out.println(task_4(doc));
        System.out.println(task_4_1(doc));
        System.out.println(task_5(doc2));
        System.out.println(task_6(doc2));
        System.out.println(task_7(doc2));
        System.out.println();
        task_8(doc3);
        System.out.println(task_9(doc));

    }
}
