package lesson5;

public class Exception {
    static class MyArraySizeException extends java.lang.Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    public static class ArrayProcessor {
        public void processArray(String[][] array) throws MyArraySizeException {
            if (array.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4x4. Количество строк:" + array.length);
            }
            for (String[] row : array) {
                if (row.length != 4) {
                    throw new MyArraySizeException("Размер массива должен быть 4x4. В одной из строк количество столбцов:" + row.length);
                }
            }

        }
    }

    public static class MyArrayDataException extends Throwable {
        ArrayProcessor processor = new ArrayProcessor();
            try {
            String[][] validArray = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };
            try {
                processor.processArray(validArray);
            } catch (MyArraySizeException ex) {
                throw new RuntimeException(ex);
            }
            String[][] invalidArray1 = {
                    {"1", "2", "3"},
                    {"4", "5", "6"},
                    {"7", "8", "9"}
            };
            try {
                processor.processArray(invalidArray1);
            } catch (MyArraySizeException ex) {
                throw new RuntimeException(ex);
            }
            String [][] invalidArray2 = {
                    {"1", "2", "f", "4"},
                    {"5", "6", "&", "8"},
                    {"9", "10", "GG", "12"},
                    {"13", "14", "15", "&&"}
            };
            try {
                processor.processArray(invalidArray2);
            } catch (MyArraySizeException ex) {
                throw new RuntimeException(ex);
            }
        } catch (MyArraySizeException e;) {
            System.err.println("Ошибка:" + e.getMessage());
        } catch (
        MyArrayDataException e;) {
            System.err.println("Ошибка:" + e.getMessage());
        }
        static class MyArrayDataException extends java.lang.Exception {
            private final int row;
            private final int col;

            public MyArrayDataException(int row, int col, String message) {
                super(message);
                this.row = row;
                this.col = col;
            }

            public int getRow() {
                return row;
            }

            public int getCol() {
                return col;
            }
        }
    }
    public static void main(String[] args) {
        int [] myArray = new int[3];
        try {
            int value = myArray [2];
            System.out.println("Значение:" + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Исключение: + e.getMessage());
            System.err.println("Ошибка: Выход за пределы массива"),
            e.printStackTrace();
        }
    }
}
