package service;

import model.Product;

public interface ProductService {
    Iterable<Product>findAll();
    Product getById(long id);
    void save(Product product);
    void  delete(long id);

}

