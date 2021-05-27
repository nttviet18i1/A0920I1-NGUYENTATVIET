package com.example.demo.service.lmpl;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.IBlog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Bloglmpl implements IBlog {
    @Autowired BlogRepository blogRepository;


    @Override
    public List<Blog> findAllBlog() {
        return blogRepository.findAll();
    }
    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);

    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
      return   blogRepository.findById(id).orElse(null);
    }
}
