package service.Impl;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductReponsitory;
import service.ProductService;
@Service
public class ProductImpl  implements ProductService {
    @Autowired
    ProductReponsitory productReponsitory;
    @Override
    public Iterable<Product> findAll() {
        return  productReponsitory.findAll();
    }

    @Override
    public Product getById(long id) {
        return productReponsitory.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        productReponsitory.save(product);
    }

    @Override
    public void delete(long id) {
        productReponsitory.deleteById(id);

    }
}
