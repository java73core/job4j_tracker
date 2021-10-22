package ru.job4j.ex;

public class FindEl {
     public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        } if (rsl < 0) {
            throw new ElementNotFoundException(" Element not found!");
         }
         return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
         String[] str = new String[] {"Mama", "mila", "ramu"};
        try {
            System.out.println(indexOf(str, "Mma"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}