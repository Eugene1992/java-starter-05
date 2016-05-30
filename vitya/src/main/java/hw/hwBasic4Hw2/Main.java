package hw.hwBasic4Hw2;

import java.util.Scanner;

/**
 * Created by User on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AbstractHandler abstxt = new TXTHandler();
        AbstractHandler absXML = new XMLHandler();
        AbstractHandler absDOC = new DOCHandler();
        System.out.print("Введите формат документа(txt,xml,doc): ");
        String input = scan.next();
        if (input.equals("txt")) {
            System.out.println("Вы выбрали формат TXT");
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Выберите операцию(open,save,change,create): ");
            String inputtxt = scan.next();
            if (inputtxt.equals("open")) {
                abstxt.open();
            }
            if (inputtxt.equals("save")) {
                abstxt.save();
            }
            if (inputtxt.equals("change")) {
                abstxt.change();
            }
            if (inputtxt.equals("create")) {
                abstxt.create();
            } else {
                System.out.println("Вы ввели неверную команду!");
            }
        }
        if (input.equals("xml")) {
            System.out.println("Вы выбрали формат XML");
            Scanner scan3 = new Scanner(System.in);
            System.out.print("Выберите операцию(open,save,change,create): ");
            String inputxml = scan.next();
            if (inputxml.equals("open")) {
                absXML.open();
            }
            if (inputxml.equals("save")) {
                absXML.save();
            }
            if (inputxml.equals("change")) {
                absXML.change();
            }
            if (inputxml.equals("create")) {
                absXML.create();
            } else {
                System.out.println("Вы ввели неверную команду!");
            }
        }
        if (input.equals("doc")) {
            System.out.println("Вы выбрали формат DOC");
            Scanner scan4 = new Scanner(System.in);
            System.out.print("Выберите операцию(open,save,change,create): ");
            String inputdoc = scan.next();
            if (inputdoc.equals("open")) {
                absDOC.open();
            }
            if (inputdoc.equals("save")) {
                absDOC.save();
            }
            if (inputdoc.equals("change")) {
                absDOC.change();
            }
            if (inputdoc.equals("create")) {
                absDOC.create();
            } else {
                System.out.println("Вы ввели неверную команду!");
            }
        }
    }
}



