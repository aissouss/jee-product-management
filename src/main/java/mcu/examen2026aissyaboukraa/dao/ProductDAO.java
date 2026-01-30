package mcu.examen2026aissyaboukraa.dao;

import mcu.examen2026aissyaboukraa.model.Product;

import java.util.ArrayList;

public class ProductDAO {
    private ArrayList<Product> products;
    private int nextId;

    public ProductDAO() {
        this.products = new ArrayList<>();
        this.nextId = 1;
    }

    public void addProduct(Product p) {
        p.setId(nextId++);
        products.add(p);
    }

    public ArrayList<Product> getAllProducts() {

        return products;
    }
}