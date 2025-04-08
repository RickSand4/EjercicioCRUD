package com.upiiz.datos.Services;

import com.upiiz.datos.Models.ProductModel;
import com.upiiz.datos.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductRepository {
//Inyectar la dependencia
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //conectar a la base de datos
    @Override
    public List<ProductModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM product", new BeanPropertyRowMapper<>(ProductModel.class));
    }

    @Override
    public ProductModel findById(int id) {
        return null;
    }

    @Override
    public void save(@org.jetbrains.annotations.NotNull ProductModel product) {
        jdbcTemplate.update("INSERT INTO product(name,price,in_stock) VALUES(?,?,?)",product.getName(), product.getPrice(),product.isInStock());
    }

    @Override
    public void update(ProductModel product) {

    }

    @Override
    public void delete(int id) {

    }

}