package com.twt.web_service.services;

import com.twt.web_service.entities.Category;
import com.twt.web_service.entities.User;
import com.twt.web_service.repositories.CategoryRepository;
import com.twt.web_service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
