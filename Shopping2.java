import java.util.*;

class Product{
    String product_name;
    double price;
    int quantity;
    Product(){
    }
    Product(String name, double price, int quantity){
        this.product_name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getpname(){
        return product_name;
    }
}
class Customer{
   private String customer_name;
   private String email;
private List<Order>orderhistory;
   Customer(String name, String email){
    this.customer_name=name;
    this.email=email;
    this.orderhistory=new ArrayList<>();
   }
  public String getName(){
    return customer_name;
   }
  public String getEmail(){
    return email;
   }
   public List<Order> getOrderhistory(){
    return orderhistory;
   }
   public void addorder(Order od){
    orderhistory.add(od);
   }
}
class Order{
    String orderId;
    Customer customer;
    List<Product>products;
    public Order(String orderId, Customer customer,Product product) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.products.add(product);
    }
    public Order(String orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }
    public String getOrderId(){
return orderId;
    }
    public Customer getCustomer(){
return customer;
    }
    public List<Product> getProduct(){
        return products;
    }
    public void addProduct(Product p){
        products.add(p);
    }
}
class Electronic extends Product{
    private String brand;
    private String model;
    Electronic(String name, double price, int quantity, String brand, String model){
        super.product_name=name;
        super.price=price;
        super.quantity=quantity;
        this.brand=brand;
        this.model=model;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
     return model;
    }
}
class Clothing extends Product{
    private String size;
    private String color;
    Clothing(String name, double price, int quantity,String size, String color){
        super.product_name=name;
        super.price=price;
        super.quantity=quantity;
        this.size=size;
        this.color=color;
    }
    public String getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
}
public class Shopping2{
    public static void main(String[] args) {
        Product laptop=new Electronic("Laptop", 70000, 2, "Dell", "Inspirion 7000");
        Product shirt=new Clothing("Shirt",1000,1,"34","Blue");
        Customer c=new Customer("Varun", "sg@gmail.com");      
         Order o1=new Order("101",c,laptop);
        List<Product>products=new ArrayList<>();
        products.add(laptop);
        products.add(shirt);
        Order o2=new Order("102",c,products);
        System.out.println("Customer:"+ o1.getCustomer().getName());
        System.out.println("Ordered products");
        for(Product product:o1.getProduct()){
            System.out.println(product.getpname()+" "+ product.quantity*product.price);
        }
        System.out.println("Customer:"+ o2.getCustomer().getName());
        System.out.println("Ordered products");
        for(Product product:o2.getProduct()){
            System.out.println(product.getpname()+" "+ product.quantity*product.price);
        }
    }
}