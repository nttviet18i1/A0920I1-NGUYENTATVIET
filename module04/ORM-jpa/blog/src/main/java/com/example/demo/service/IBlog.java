package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;

public interface IBlog {
    List<Blog> findAllBlog();

    void delete(int id);
    void save(Blog blog);
    void update(Blog blog);
    Blog findById(int id);
}
