import java.lang.System;
import java.util.Scanner;

public abstract class Product { // defines the `Product` class i.e blueprint
  private String name;
  private double price;
  private String sku;
  private int quantity;

  // same name as above, but below `Product` is a constructor method
  public Product() {
    this.name = "N/A";
    this.price = 0.0;
    this.sku = "N/A";
    this.quantity = 0;
  }

  public Product(String name, double price, String sku, int quantity) {
    this.name = name;
    this.price = price;
    this.sku = sku;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price >= 0) {
      this.price = price;
    } else {
      throw new IllegalArgumentException("Invalid price. Please provide a non-negative value.");
    }
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    if (sku != null && !sku.isEmpty()) {
      this.sku = sku;
    } else {
      throw new IllegalArgumentException("Invalid SKU. Please provide a non-empty string.");
    }
  }

  public int getQuantity() {
      return quantity;
  }

  public void setQuantity(int quantity) {
      if (quantity >= 0) {
          this.quantity = quantity;
      } else {
          throw new IllegalArgumentException("Invalid quantity. Please provide a non-negative value.");
      }
  }

  public void displayDetails() {
    System.out.println("Product Name: " + getName());
    System.out.println("Product Price: " + getPrice());
    System.out.println("Product SKU: " + getSku());
    System.out.println("Porduct Quantity: " + getQuantity());
  }

public void editDetails() {
  
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter the new name: ");
  String newName = scanner.nextLine();
  this.setName(newName);

  System.out.println("Enter the new price: ");
  double newPrice = scanner.nextDouble();
  this.setPrice(newPrice);

  scanner.nextLine();

  System.out.println("Enter the new SKU: ");
  String newSku = scanner.nextLine();
  this.setSku(newSku);

  System.out.println("Enter the new quantity: ");
  int newQuantity = scanner.nextInt();
  this.setQuantity(newQuantity);
  scanner.nextLine();
}
}