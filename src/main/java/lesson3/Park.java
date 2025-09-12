package lesson3;

public class Park {
    private int hours;
    public Park (int hours) {
        this.hours = hours;

     }

    public class Attractions {
        private String kind;
        private int hours;
        private int price;

        public Attractions(String kind, int hours, int price) {
            this.kind = kind;
            this.hours = hours;
            this.price = price;
        }

        public String getKind() {
            return kind;
        }

        public int getHours() {
            return hours;
        }

        public int getPrice() {
            return price;
        }
    }
}
