import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Price=$" + price +
                ", Category='" + category + '\'' +
                '}';
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

public class ECommerceProductCatalog {
    public static void main(String[] args) {
        TreeMap<Integer, Product> productCatalog = new TreeMap<>();
        HashSet<Product> productSet = new HashSet<>();

     
        Product p1 = new Product(101, "Laptop", 1200.50, "Electronics");
        Product p2 = new Product(102, "Smartphone", 800.99, "Electronics");
        Product p3 = new Product(103, "Headphones", 150.75, "Accessories");
        Product p4 = new Product(104, "Coffee Maker", 99.99, "Home Appliances");

        productCatalog.put(p1.getId(), p1);
        productCatalog.put(p2.getId(), p2);
        productCatalog.put(p3.getId(), p3);
        productCatalog.put(p4.getId(), p4);

        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);
        productSet.add(p4);

      
        System.out.println("Products in Catalog (Sorted by ID):");
        for (Map.Entry<Integer, Product> entry : productCatalog.entrySet()) {
            System.out.println(entry.getValue());
        }

        
        System.out.println("\nProducts in Set (Unordered):");
        for (Product product : productSet) {
            System.out.println(product);
        }

        
        List<Product> productList = new ArrayList<>(productSet);
        productList.sort(new PriceComparator());

        System.out.println("\nProducts Sorted by Price:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}