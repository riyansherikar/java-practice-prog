

public class Product {
    int id;
    String product_name;
    double price;

    Product(int id, String product_name, double price){
        this.id = id;
        this.product_name = product_name;
        this.price = price;
    }
    @SuppressWarnings("unused")
    Product(int id, String product_name){
        this.id = id;
        this.product_name = product_name;
        this.price = 0.0;
    }

    double totalPrice(Product p){
        return this.price + p.price;
    }

    void displayProduct(){
        System.out.println("Product Id"+id);
        System.out.println("Product name"+product_name);
        System.out.println("Product price"+price);
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "apple", 50000);
        Product p2 = new Product(2, "vivo", 30000);

        p1.displayProduct();
        p2.displayProduct();

        double total = p1.totalPrice(p2);

        System.out.println("Total price is "+total);

    }
}
