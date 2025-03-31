package com.upiiz.datos.Services;

import com.upiiz.datos.Models.ProductModel;
import com.upiiz.datos.Repositories.ProductRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductRepository {
    @Override
    public List<ProductModel> findAll() {
        return List.of();
    }

    @Override
    public ProductModel findById(int id) {
        return null;
    }

    @Override
    public void save(ProductModel product) {

    }

    @Override
    public void update(ProductModel product) {

    }

    @Override
    public void delete(int id) {

    }
}
