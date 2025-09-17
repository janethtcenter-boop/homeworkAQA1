package Lesson1;

public class InvertArray {
    public static void main (String[] args) {
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array [i] == 0) {
                array [i] = 1;
            } else {
                array [i] = 0;
            }
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
