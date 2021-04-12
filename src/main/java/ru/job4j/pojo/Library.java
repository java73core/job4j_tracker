package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 96);
        Book book2 = new Book("Good code", 196);
        Book book3 = new Book("Mad code", 296);
        Book book4 = new Book("Mad Max", 396);
        Book[] lib = new Book[4];
        lib[0] = book1;
        lib[1] = book2;
        lib[2] = book3;
        lib[3] = book4;
        for (int i = 0; i < lib.length; i++) {
            Book cc = lib[i];
            System.out.println(cc.getName() + " - " + cc.getPages());
        }
        Book tmp = lib[0];
        lib[0] = lib[3];
        lib[3] = tmp;
        System.out.println();
        for (int i = 0; i < lib.length; i++) {
            Book cc = lib[i];
            System.out.println(cc.getName() + " - " + cc.getPages());
        }
        System.out.println();
        for (int i = 0; i < lib.length; i++) {
            Book cc = lib[i];
            if (cc.getName().equals("Clean code")) {
                System.out.println(cc.getName() + " - " + cc.getPages());
            }
        }
    }
}
