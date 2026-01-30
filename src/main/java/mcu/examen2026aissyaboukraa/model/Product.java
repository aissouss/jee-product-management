package mcu.examen2026aissyaboukraa.model;

public class Product {
    private int id;
    private String productName;
    private int quantity;
    private String category;
    private int price;

    public Product() {
    }

    public Product(int id, String productName, int quantity, String category, int price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


