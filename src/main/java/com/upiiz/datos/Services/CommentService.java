package com.upiiz.datos.Services;


import com.upiiz.datos.Models.CommentModel;
import com.upiiz.datos.Repositories.CommentRepository;
import com.upiiz.datos.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


//implement - Interfes
//extend    - Herencia
@Service
public class CommentService implements CommentRepository {

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
}
