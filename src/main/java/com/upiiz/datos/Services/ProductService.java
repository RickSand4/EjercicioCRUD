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

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ProductModel> findAll() {
        String sql = "SELECT * FROM Product"; // Cambiado a "Product" (nombre de tabla según tu esquema SQL)
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ProductModel.class));
    }

    @Override
    public Optional<ProductModel> findById(int id) {
        String sql = "SELECT * FROM Product WHERE id = ?";
        try {
            ProductModel product = jdbcTemplate.queryForObject(
                    sql,
                    new Object[]{id},
                    new BeanPropertyRowMapper<>(ProductModel.class));
            return Optional.ofNullable(product);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public int save(ProductModel product) {
        String sql = "INSERT INTO Product (name, price, in_stock) VALUES (?, ?, ?)";
        return jdbcTemplate.update(
                sql,
                product.getName(),
                product.getPrice(),
                product.isInStock());
    }

    @Override
    public int update(ProductModel product) {
        String sql = "UPDATE Product SET name = ?, price = ?, in_stock = ? WHERE id = ?";
        return jdbcTemplate.update(
                sql,
                product.getName(),
                product.getPrice(),
                product.isInStock(),
                product.getId());
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM Product WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}