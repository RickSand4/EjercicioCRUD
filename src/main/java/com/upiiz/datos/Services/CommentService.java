package com.upiiz.datos.Services;


import com.upiiz.datos.Models.CommentModel;
import com.upiiz.datos.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


//implement - Interfes
//extend    - Herencia
@Service
public class CommentService implements CommentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CommentModel> findAll() {
        return List.of();
    }

    @Override
    public CommentModel findByID(long id) {
        return null;
    }

    @Override
    public void save(CommentModel comment) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(CommentModel comment) {

    }

    @Override
    public void deleteByid(int id) {

    }

    @Override
    public List<CommentModel> findCommentsProductByid(int product_id) {

        return jdbcTemplate.query("SELECT * FROM comments WHERE id_product = ?", new BeanPropertyRowMapper<>(CommentModel.class), product_id);
    }

}
