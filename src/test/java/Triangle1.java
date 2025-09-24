public class Triangle1 {
    public static double area(double base, double height) {
        if (base <= 0) {
            throw new IllegalArgumentException("Основание должно быть положительным");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Высота должна быть положительной");
        }
        return 0.5 * base * height;
    }
}
