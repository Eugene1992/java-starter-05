package hw.hwBasic3Hw4;

import java.util.Scanner;

/**
 * Created by User on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DocumentWorker documentWorker = new DocumentWorker();
        ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
        ProDocumentWorker proDocumentWorker = new ProDocumentWorker();


        System.out.print("Введите ключ доступа к программе : ");
        String input = scan.next();
        if (input.equals("exp")) {
            System.out.println("Вы выбрали режим Експерт!");
            documentWorker.openDocument();
            documentWorker.editDocument();
            DocumentWorker up = new ExpertDocumentWorker();
            expertDocumentWorker.saveDocument();
        }
        if (input.equals("pro")) {
            System.out.println("Вы выбрали режим Про");
            documentWorker.openDocument();
            DocumentWorker down = new ProDocumentWorker();
            proDocumentWorker.saveDocument();
            proDocumentWorker.editDocument();
        } else {
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
    }
}

