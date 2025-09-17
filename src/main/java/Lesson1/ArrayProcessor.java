package Lesson1;

public class ArrayProcessor {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 6, 4, 2, 11};
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.print(array[i] + "");
    }
}

