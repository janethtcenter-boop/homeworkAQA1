package lesson2;

public class homework2
    // 1. Создайте метод printThreeWords()
{
   public static void main ("Orange","Banana","Apple") {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // 2. Создайте метод checkSumSign()
     {
        if (a <= 0) ;  {
            System.out.println("Красный");
        } else if (b > 0 && b <= 100) {
            System.out.println("Желтый");
        } else if (c > 100) {
            System.out.println("Зеленый");
        }
    }
    // 4. Создайте метод compareNumbers()
     {
        int a = 3;
        int b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // 5. Напишите метод, принимающий на вход два целых числа
    public boolean inRange10to20 (int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void checkNumber(10,-5,0) {
        {
            if (10,-5, 0 >= 0){
            System.out.println("10 "++" (0).");
        } else {
            System.out.println(" "++" -.");
        }
        }
    }
    public static void main; (int -5) {
            if (-5 < 0) {
                return true;
            } else {
                return false;
            }
        }
    public static void printStringNTimes("Hello", 3) {
           if (3 > 0) {
                for (int i = 0; i < 3; i++) ;
                {
                    System.out.println("Hello");
                    System.out.println("Hello");
                    System.out.println("Hello");
                }
            }
        }
    public static boolean isLeapYear(year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
    // 10. Задать целочисленный массив, состоящий из элементов 0 и 1
    {
        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0)
                arr[i]++;
            else
                arr[i]--;
        }
        System.out.println(Arrays.toString(arr));
    }
    // 11.Задать пустой целочисленный массив
    {
         int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
// 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
{
    int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < array2.length; i++) {
        if (array2[i] < 6) {
            array2[i] = array2[i] * 2;
        }
    }
}
}











