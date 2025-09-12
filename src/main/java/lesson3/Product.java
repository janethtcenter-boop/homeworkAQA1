package lesson3;

public class Product {
    private String name;
    private String manufacturer;
    private String country;
    private int date;
    private int price;
    private String status;

    public Product(String name, String manufacturer, String country, int date, int price, String status) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.country = country;
        this.date = date;
        this.price = price;
        this.status = status;
    }
    Product[] productsArray = new Product[5];

    {
        productsArray[0] = new Product("Nokia", "Nokia ltd.", "Korea", 2000, 345, "done");
                productsArray[1] = new Product("Kia", "Kia motors", "Russia",1998, 3544, "pending");
                        productsArray[2] = new Product("Volvo", "Volvo lmt.", "Russia", 1999, 33655, "done");
                                productsArray[3] = new Product("Kia", "Kia motors", "Korea", 2008, 44335, "late");
                                        productsArray[4] = new Product("Noli", "Noli", "Korea", 2007, 44337, "accepted");
    }

    public Product[] getProductsArray() {
        return productsArray;
    }
}




